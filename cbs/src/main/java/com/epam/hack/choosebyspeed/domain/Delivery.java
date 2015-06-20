package com.epam.hack.choosebyspeed.domain;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import javax.persistence.ManyToOne;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Past;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.transaction.annotation.Transactional;

@Entity
@Configurable
@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson(deepSerialize = true)
public class Delivery {

    /**
     */
    @ManyToOne
    private Provider provider;

    /**
     */
    @ManyToOne
    private Customer customer;

    /**
     */
    @Past
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date timeStart;

    /**
     */
    @Past
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date timeEnd;

    /**
     */
    private Float timeDuration;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
    private Integer version;

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

	@PersistenceContext
    transient EntityManager entityManager;

	public static final List<String> fieldNames4OrderClauseFilter = java.util.Arrays.asList("provider", "customer", "timeStart", "timeEnd", "timeDuration");

	public static final EntityManager entityManager() {
        EntityManager em = new Delivery().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }

	public static long countDeliverys() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Delivery o", Long.class).getSingleResult();
    }

	public static List<Delivery> findAllDeliverys() {
        return entityManager().createQuery("SELECT o FROM Delivery o", Delivery.class).getResultList();
    }

	public static List<Delivery> findAllDeliverys(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Delivery o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Delivery.class).getResultList();
    }

	public static Delivery findDelivery(Long id) {
        if (id == null) return null;
        return entityManager().find(Delivery.class, id);
    }

	public static List<Delivery> findDeliveryEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Delivery o", Delivery.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

	public static List<Delivery> findDeliveryEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Delivery o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Delivery.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
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
            Delivery attached = Delivery.findDelivery(this.id);
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
    public Delivery merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Delivery merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }

	public Provider getProvider() {
        return this.provider;
    }

	public void setProvider(Provider provider) {
        this.provider = provider;
    }

	public Customer getCustomer() {
        return this.customer;
    }

	public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	public Date getTimeStart() {
        return this.timeStart;
    }

	public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

	public Date getTimeEnd() {
        return this.timeEnd;
    }

	public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

	public Float getTimeDuration() {
        return this.timeDuration;
    }

	public void setTimeDuration(Float timeDuration) {
        this.timeDuration = timeDuration;
    }

	public String toJson() {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(this);
    }

	public String toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(this);
    }

	public static Delivery fromJsonToDelivery(String json) {
        return new JSONDeserializer<Delivery>()
        .use(null, Delivery.class).deserialize(json);
    }

	public static String toJsonArray(Collection<Delivery> collection) {
        return new JSONSerializer()
        .exclude("*.class").deepSerialize(collection);
    }

	public static String toJsonArray(Collection<Delivery> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").deepSerialize(collection);
    }

	public static Collection<Delivery> fromJsonArrayToDeliverys(String json) {
        return new JSONDeserializer<List<Delivery>>()
        .use("values", Delivery.class).deserialize(json);
    }

	public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
