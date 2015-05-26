/**
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.market.id;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.market.MarketDataFeed;
import com.opengamma.strata.market.curve.CurveGroupName;

/**
 * Market data ID identifying the discounting curve for a currency.
 */
@BeanDefinition(builderScope = "private")
public final class DiscountingCurveId implements RateCurveId, ImmutableBean {

  /** The currency of the discounting curve. */
  @PropertyDefinition(validate = "notNull", overrideGet = true)
  private final Currency currency;

  /** The name of the curve group containing the curve. */
  @PropertyDefinition(validate = "notNull")
  private final CurveGroupName curveGroupName;

  /** The market data feed which provides quotes used to build the curve. */
  @PropertyDefinition(validate = "notNull")
  private final MarketDataFeed marketDataFeed;

  /**
   * Returns an ID that identifies the discounting curve for the specified currency.
   *
   * @param currency  the currency of the discounting curve
   * @param curveGroupName  the name of the curve group containing the curve
   * @param marketDataFeed  the market data feed which provides quotes used to build the curve
   * @return an ID that identifies the discounting curve for the specified currency
   */
  public static DiscountingCurveId of(Currency currency, CurveGroupName curveGroupName, MarketDataFeed marketDataFeed) {
    return new DiscountingCurveId(currency, curveGroupName, marketDataFeed);
  }

  /**
   * Returns an ID that identifies the discounting curve for the specified currency.
   *
   * @param currency  the currency of the discounting curve
   * @param curveGroupName  the name of the curve group containing the curve
   * @return an ID that identifies the discounting curve for the specified currency
   */
  public static DiscountingCurveId of(Currency currency, CurveGroupName curveGroupName) {
    return new DiscountingCurveId(currency, curveGroupName, MarketDataFeed.NONE);
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code DiscountingCurveId}.
   * @return the meta-bean, not null
   */
  public static DiscountingCurveId.Meta meta() {
    return DiscountingCurveId.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(DiscountingCurveId.Meta.INSTANCE);
  }

  private DiscountingCurveId(
      Currency currency,
      CurveGroupName curveGroupName,
      MarketDataFeed marketDataFeed) {
    JodaBeanUtils.notNull(currency, "currency");
    JodaBeanUtils.notNull(curveGroupName, "curveGroupName");
    JodaBeanUtils.notNull(marketDataFeed, "marketDataFeed");
    this.currency = currency;
    this.curveGroupName = curveGroupName;
    this.marketDataFeed = marketDataFeed;
  }

  @Override
  public DiscountingCurveId.Meta metaBean() {
    return DiscountingCurveId.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the currency of the discounting curve.
   * @return the value of the property, not null
   */
  @Override
  public Currency getCurrency() {
    return currency;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the name of the curve group containing the curve.
   * @return the value of the property, not null
   */
  public CurveGroupName getCurveGroupName() {
    return curveGroupName;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the market data feed which provides quotes used to build the curve.
   * @return the value of the property, not null
   */
  public MarketDataFeed getMarketDataFeed() {
    return marketDataFeed;
  }

  //-----------------------------------------------------------------------
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      DiscountingCurveId other = (DiscountingCurveId) obj;
      return JodaBeanUtils.equal(getCurrency(), other.getCurrency()) &&
          JodaBeanUtils.equal(getCurveGroupName(), other.getCurveGroupName()) &&
          JodaBeanUtils.equal(getMarketDataFeed(), other.getMarketDataFeed());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(getCurrency());
    hash = hash * 31 + JodaBeanUtils.hashCode(getCurveGroupName());
    hash = hash * 31 + JodaBeanUtils.hashCode(getMarketDataFeed());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(128);
    buf.append("DiscountingCurveId{");
    buf.append("currency").append('=').append(getCurrency()).append(',').append(' ');
    buf.append("curveGroupName").append('=').append(getCurveGroupName()).append(',').append(' ');
    buf.append("marketDataFeed").append('=').append(JodaBeanUtils.toString(getMarketDataFeed()));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code DiscountingCurveId}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code currency} property.
     */
    private final MetaProperty<Currency> currency = DirectMetaProperty.ofImmutable(
        this, "currency", DiscountingCurveId.class, Currency.class);
    /**
     * The meta-property for the {@code curveGroupName} property.
     */
    private final MetaProperty<CurveGroupName> curveGroupName = DirectMetaProperty.ofImmutable(
        this, "curveGroupName", DiscountingCurveId.class, CurveGroupName.class);
    /**
     * The meta-property for the {@code marketDataFeed} property.
     */
    private final MetaProperty<MarketDataFeed> marketDataFeed = DirectMetaProperty.ofImmutable(
        this, "marketDataFeed", DiscountingCurveId.class, MarketDataFeed.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "currency",
        "curveGroupName",
        "marketDataFeed");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 575402001:  // currency
          return currency;
        case -382645893:  // curveGroupName
          return curveGroupName;
        case 842621124:  // marketDataFeed
          return marketDataFeed;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends DiscountingCurveId> builder() {
      return new DiscountingCurveId.Builder();
    }

    @Override
    public Class<? extends DiscountingCurveId> beanType() {
      return DiscountingCurveId.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code currency} property.
     * @return the meta-property, not null
     */
    public MetaProperty<Currency> currency() {
      return currency;
    }

    /**
     * The meta-property for the {@code curveGroupName} property.
     * @return the meta-property, not null
     */
    public MetaProperty<CurveGroupName> curveGroupName() {
      return curveGroupName;
    }

    /**
     * The meta-property for the {@code marketDataFeed} property.
     * @return the meta-property, not null
     */
    public MetaProperty<MarketDataFeed> marketDataFeed() {
      return marketDataFeed;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 575402001:  // currency
          return ((DiscountingCurveId) bean).getCurrency();
        case -382645893:  // curveGroupName
          return ((DiscountingCurveId) bean).getCurveGroupName();
        case 842621124:  // marketDataFeed
          return ((DiscountingCurveId) bean).getMarketDataFeed();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code DiscountingCurveId}.
   */
  private static final class Builder extends DirectFieldsBeanBuilder<DiscountingCurveId> {

    private Currency currency;
    private CurveGroupName curveGroupName;
    private MarketDataFeed marketDataFeed;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 575402001:  // currency
          return currency;
        case -382645893:  // curveGroupName
          return curveGroupName;
        case 842621124:  // marketDataFeed
          return marketDataFeed;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 575402001:  // currency
          this.currency = (Currency) newValue;
          break;
        case -382645893:  // curveGroupName
          this.curveGroupName = (CurveGroupName) newValue;
          break;
        case 842621124:  // marketDataFeed
          this.marketDataFeed = (MarketDataFeed) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public DiscountingCurveId build() {
      return new DiscountingCurveId(
          currency,
          curveGroupName,
          marketDataFeed);
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(128);
      buf.append("DiscountingCurveId.Builder{");
      buf.append("currency").append('=').append(JodaBeanUtils.toString(currency)).append(',').append(' ');
      buf.append("curveGroupName").append('=').append(JodaBeanUtils.toString(curveGroupName)).append(',').append(' ');
      buf.append("marketDataFeed").append('=').append(JodaBeanUtils.toString(marketDataFeed));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
