package com.epam.hack.choosebyspeed.web;

import com.epam.hack.choosebyspeed.domain.Category;
import com.epam.hack.choosebyspeed.domain.Customer;
import com.epam.hack.choosebyspeed.domain.Delivery;
import com.epam.hack.choosebyspeed.domain.Product;
import com.epam.hack.choosebyspeed.domain.Promotion;
import com.epam.hack.choosebyspeed.domain.Provider;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.roo.addon.web.mvc.controller.converter.RooConversionService;

@Configurable
/**
 * A central place to register application converters and formatters. 
 */
@RooConversionService
public class ApplicationConversionServiceFactoryBean extends FormattingConversionServiceFactoryBean {

	@Override
	protected void installFormatters(FormatterRegistry registry) {
		super.installFormatters(registry);
		// Register application converters and formatters
	}

	public Converter<Category, String> getCategoryToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.epam.hack.choosebyspeed.domain.Category, java.lang.String>() {
            public String convert(Category category) {
                return new StringBuilder().append(category.getName()).toString();
            }
        };
    }

	public Converter<Long, Category> getIdToCategoryConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.epam.hack.choosebyspeed.domain.Category>() {
            public com.epam.hack.choosebyspeed.domain.Category convert(java.lang.Long id) {
                return Category.findCategory(id);
            }
        };
    }

	public Converter<String, Category> getStringToCategoryConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.epam.hack.choosebyspeed.domain.Category>() {
            public com.epam.hack.choosebyspeed.domain.Category convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Category.class);
            }
        };
    }

	public Converter<Customer, String> getCustomerToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.epam.hack.choosebyspeed.domain.Customer, java.lang.String>() {
            public String convert(Customer customer) {
                return new StringBuilder().append(customer.getName()).append(' ').append(customer.getEmail()).append(' ').append(customer.getPhoneNumber()).append(' ').append(customer.getAddress()).toString();
            }
        };
    }

	public Converter<Long, Customer> getIdToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.epam.hack.choosebyspeed.domain.Customer>() {
            public com.epam.hack.choosebyspeed.domain.Customer convert(java.lang.Long id) {
                return Customer.findCustomer(id);
            }
        };
    }

	public Converter<String, Customer> getStringToCustomerConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.epam.hack.choosebyspeed.domain.Customer>() {
            public com.epam.hack.choosebyspeed.domain.Customer convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Customer.class);
            }
        };
    }

	public Converter<Delivery, String> getDeliveryToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.epam.hack.choosebyspeed.domain.Delivery, java.lang.String>() {
            public String convert(Delivery delivery) {
                return new StringBuilder().append(delivery.getTimeStart()).append(' ').append(delivery.getTimeEnd()).append(' ').append(delivery.getTimeDuration()).toString();
            }
        };
    }

	public Converter<Long, Delivery> getIdToDeliveryConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.epam.hack.choosebyspeed.domain.Delivery>() {
            public com.epam.hack.choosebyspeed.domain.Delivery convert(java.lang.Long id) {
                return Delivery.findDelivery(id);
            }
        };
    }

	public Converter<String, Delivery> getStringToDeliveryConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.epam.hack.choosebyspeed.domain.Delivery>() {
            public com.epam.hack.choosebyspeed.domain.Delivery convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Delivery.class);
            }
        };
    }

	public Converter<Product, String> getProductToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.epam.hack.choosebyspeed.domain.Product, java.lang.String>() {
            public String convert(Product product) {
                return new StringBuilder().append(product.getName()).toString();
            }
        };
    }

	public Converter<Long, Product> getIdToProductConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.epam.hack.choosebyspeed.domain.Product>() {
            public com.epam.hack.choosebyspeed.domain.Product convert(java.lang.Long id) {
                return Product.findProduct(id);
            }
        };
    }

	public Converter<String, Product> getStringToProductConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.epam.hack.choosebyspeed.domain.Product>() {
            public com.epam.hack.choosebyspeed.domain.Product convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Product.class);
            }
        };
    }

	public Converter<Promotion, String> getPromotionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.epam.hack.choosebyspeed.domain.Promotion, java.lang.String>() {
            public String convert(Promotion promotion) {
                return new StringBuilder().append(promotion.getName()).append(' ').append(promotion.getDescription()).append(' ').append(promotion.getPeriodStart()).append(' ').append(promotion.getPeriodEnd()).toString();
            }
        };
    }

	public Converter<Long, Promotion> getIdToPromotionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.epam.hack.choosebyspeed.domain.Promotion>() {
            public com.epam.hack.choosebyspeed.domain.Promotion convert(java.lang.Long id) {
                return Promotion.findPromotion(id);
            }
        };
    }

	public Converter<String, Promotion> getStringToPromotionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.epam.hack.choosebyspeed.domain.Promotion>() {
            public com.epam.hack.choosebyspeed.domain.Promotion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Promotion.class);
            }
        };
    }

	public Converter<Provider, String> getProviderToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<com.epam.hack.choosebyspeed.domain.Provider, java.lang.String>() {
            public String convert(Provider provider) {
                return new StringBuilder().append(provider.getName()).append(' ').append(provider.getLocationLat()).append(' ').append(provider.getLocationLong()).append(' ').append(provider.getImageUrl()).toString();
            }
        };
    }

	public Converter<Long, Provider> getIdToProviderConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, com.epam.hack.choosebyspeed.domain.Provider>() {
            public com.epam.hack.choosebyspeed.domain.Provider convert(java.lang.Long id) {
                return Provider.findProvider(id);
            }
        };
    }

	public Converter<String, Provider> getStringToProviderConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, com.epam.hack.choosebyspeed.domain.Provider>() {
            public com.epam.hack.choosebyspeed.domain.Provider convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Provider.class);
            }
        };
    }

	public void installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getCategoryToStringConverter());
        registry.addConverter(getIdToCategoryConverter());
        registry.addConverter(getStringToCategoryConverter());
        registry.addConverter(getCustomerToStringConverter());
        registry.addConverter(getIdToCustomerConverter());
        registry.addConverter(getStringToCustomerConverter());
        registry.addConverter(getDeliveryToStringConverter());
        registry.addConverter(getIdToDeliveryConverter());
        registry.addConverter(getStringToDeliveryConverter());
        registry.addConverter(getProductToStringConverter());
        registry.addConverter(getIdToProductConverter());
        registry.addConverter(getStringToProductConverter());
        registry.addConverter(getPromotionToStringConverter());
        registry.addConverter(getIdToPromotionConverter());
        registry.addConverter(getStringToPromotionConverter());
        registry.addConverter(getProviderToStringConverter());
        registry.addConverter(getIdToProviderConverter());
        registry.addConverter(getStringToProviderConverter());
    }

	public void afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
}
