package com.epam.hack.choosebyspeed.domain;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;

import java.util.Collection;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.transaction.annotation.Transactional;

@Configurable
@Entity
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson(deepSerialize = true)
public class Provider {

    /**
     */
    @NotNull
    @Size(max = 30)
    private String name;

    /**
     */
    @ManyToOne
    private Category category;

    /**
     */
    private Float locationLat;

    /**
     */
    private Float locationLong;

    /**
     */
    @NotNull
    @Size(max = 300)
    private String imageUrl;

    /**
     */
    @RooUploadedFile(contentType = "image/jpeg")
    @Lob
    private byte[] image;

    /**
     */
    @NotNull
    @Size(max = 500)
    private String description;

    /**
     */
    @NotNull
    @Size(max = 500)
    private String phoneNumber;

    /**
     */
    @NotNull
    @Size(max = 500)
    private String menuHtml;

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
    private Integer version;

	@Transient
	private int averageDeliveryRating;
	
	public int getAverageDeliveryRating() {
		return averageDeliveryRating;
	}

	public void setAverageDeliveryRating(int averageDuration) {
		this.averageDeliveryRating = averageDuration;
	}

	public Long getId() {
        return this.id;
    }

	public void setId(Long id) {
        this.id = id;
    }

	public Integer getVersion() {
        return this.version;
    }

	public void setVersion(Integer version) {
        this.version = version;
    }

	public String getName() {
        return this.name;
    }

	public void setName(String name) {
        this.name = name;
    }

	public Category getCategory() {
        return this.category;
    }

	public void setCategory(Category category) {
        this.category = category;
    }

	public Float getLocationLat() {
        return this.locationLat;
    }

	public void setLocationLat(Float locationLat) {
        this.locationLat = locationLat;
    }

	public Float getLocationLong() {
        return this.locationLong;
    }

	public void setLocationLong(Float locationLong) {
        this.locationLong = locationLong;
    }

	public String getImageUrl() {
        return this.imageUrl;
    }

	public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

	public byte[] getImage() {
        return this.image;
    }

	public void setImage(byte[] image) {
        this.image = image;
    }

	public String getDescription() {
        return this.description;
    }

	public void setDescription(String description) {
        this.description = description;
    }

	public String getPhoneNumber() {
        return this.phoneNumber;
    }

	public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	public String getMenuHtml() {
        return this.menuHtml;
    }

	public void setMenuHtml(String menuHtml) {
        this.menuHtml = menuHtml;
    }

	@PersistenceContext
    transient EntityManager entityManager;

	public static final List<String> fieldNames4OrderClauseFilter = java.util.Arrays.asList("name", "category", "locationLat", "locationLong", "imageUrl", "image", "description", "phoneNumber", "menuHtml");

	public static final EntityManager entityManager() {
        EntityManager em = new Provider().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }

	public static long countProviders() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Provider o", Long.class).getSingleResult();
    }

	public static List<Provider> findAllProviders() {
        return entityManager().createQuery("SELECT o FROM Provider o", Provider.class).getResultList();
    }
	
	/**
	 * Try findProvidersByCategoryId
	 * @param categoryId
	 * @return
	 */
	public static List<Provider> findProvidersByCategoryId(String categoryId) {
		Query query = entityManager().createQuery("SELECT p FROM Provider p Join fetch p.category c where c.id = :cid", Provider.class);
		query.setParameter("cid", Long.parseLong(categoryId));
		return query.getResultList();
    }

	public static List<Provider> findAllProviders(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Provider o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Provider.class).getResultList();
    }

	public static Provider findProvider(Long id) {
        if (id == null) return null;
        return entityManager().find(Provider.class, id);
    }

	public static List<Provider> findProviderEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Provider o", Provider.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

	public static List<Provider> findProviderEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Provider o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Provider.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

	@Transactional
    public void persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }

	@Transactional
    public void remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Provider attached = Provider.findProvider(this.id);
            this.entityManager.remove(attached);
        }
    }

	@Transactional
    public void flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }

	@Transactional
    public void clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }

	@Transactional
    public Provider merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Provider merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }

	public String toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }

	public String toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }

	public static Provider fromJsonToProvider(String json) {
        return new JSONDeserializer<Provider>()
        .use(null, Provider.class).deserialize(json);
    }

	public static String toJsonArray(Collection<Provider> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }

	public static String toJsonArray(Collection<Provider> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }

	public static Collection<Provider> fromJsonArrayToProviders(String json) {
        return new JSONDeserializer<List<Provider>>()
        .use("values", Provider.class).deserialize(json);
    }
}
