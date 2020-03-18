package com.qf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TOrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderdetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("productID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andTotal0IsNull() {
            addCriterion("total0 is null");
            return (Criteria) this;
        }

        public Criteria andTotal0IsNotNull() {
            addCriterion("total0 is not null");
            return (Criteria) this;
        }

        public Criteria andTotal0EqualTo(BigDecimal value) {
            addCriterion("total0 =", value, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0NotEqualTo(BigDecimal value) {
            addCriterion("total0 <>", value, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0GreaterThan(BigDecimal value) {
            addCriterion("total0 >", value, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total0 >=", value, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0LessThan(BigDecimal value) {
            addCriterion("total0 <", value, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("total0 <=", value, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0In(List<BigDecimal> values) {
            addCriterion("total0 in", values, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0NotIn(List<BigDecimal> values) {
            addCriterion("total0 not in", values, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("total0 between", value1, value2, "total0");
            return (Criteria) this;
        }

        public Criteria andTotal0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total0 not between", value1, value2, "total0");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNull() {
            addCriterion("isComment is null");
            return (Criteria) this;
        }

        public Criteria andIscommentIsNotNull() {
            addCriterion("isComment is not null");
            return (Criteria) this;
        }

        public Criteria andIscommentEqualTo(String value) {
            addCriterion("isComment =", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotEqualTo(String value) {
            addCriterion("isComment <>", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThan(String value) {
            addCriterion("isComment >", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentGreaterThanOrEqualTo(String value) {
            addCriterion("isComment >=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThan(String value) {
            addCriterion("isComment <", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLessThanOrEqualTo(String value) {
            addCriterion("isComment <=", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentLike(String value) {
            addCriterion("isComment like", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotLike(String value) {
            addCriterion("isComment not like", value, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentIn(List<String> values) {
            addCriterion("isComment in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotIn(List<String> values) {
            addCriterion("isComment not in", values, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentBetween(String value1, String value2) {
            addCriterion("isComment between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andIscommentNotBetween(String value1, String value2) {
            addCriterion("isComment not between", value1, value2, "iscomment");
            return (Criteria) this;
        }

        public Criteria andLowstocksIsNull() {
            addCriterion("lowStocks is null");
            return (Criteria) this;
        }

        public Criteria andLowstocksIsNotNull() {
            addCriterion("lowStocks is not null");
            return (Criteria) this;
        }

        public Criteria andLowstocksEqualTo(String value) {
            addCriterion("lowStocks =", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksNotEqualTo(String value) {
            addCriterion("lowStocks <>", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksGreaterThan(String value) {
            addCriterion("lowStocks >", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksGreaterThanOrEqualTo(String value) {
            addCriterion("lowStocks >=", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksLessThan(String value) {
            addCriterion("lowStocks <", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksLessThanOrEqualTo(String value) {
            addCriterion("lowStocks <=", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksLike(String value) {
            addCriterion("lowStocks like", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksNotLike(String value) {
            addCriterion("lowStocks not like", value, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksIn(List<String> values) {
            addCriterion("lowStocks in", values, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksNotIn(List<String> values) {
            addCriterion("lowStocks not in", values, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksBetween(String value1, String value2) {
            addCriterion("lowStocks between", value1, value2, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andLowstocksNotBetween(String value1, String value2) {
            addCriterion("lowStocks not between", value1, value2, "lowstocks");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSpecinfoIsNull() {
            addCriterion("specInfo is null");
            return (Criteria) this;
        }

        public Criteria andSpecinfoIsNotNull() {
            addCriterion("specInfo is not null");
            return (Criteria) this;
        }

        public Criteria andSpecinfoEqualTo(String value) {
            addCriterion("specInfo =", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoNotEqualTo(String value) {
            addCriterion("specInfo <>", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoGreaterThan(String value) {
            addCriterion("specInfo >", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoGreaterThanOrEqualTo(String value) {
            addCriterion("specInfo >=", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoLessThan(String value) {
            addCriterion("specInfo <", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoLessThanOrEqualTo(String value) {
            addCriterion("specInfo <=", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoLike(String value) {
            addCriterion("specInfo like", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoNotLike(String value) {
            addCriterion("specInfo not like", value, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoIn(List<String> values) {
            addCriterion("specInfo in", values, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoNotIn(List<String> values) {
            addCriterion("specInfo not in", values, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoBetween(String value1, String value2) {
            addCriterion("specInfo between", value1, value2, "specinfo");
            return (Criteria) this;
        }

        public Criteria andSpecinfoNotBetween(String value1, String value2) {
            addCriterion("specInfo not between", value1, value2, "specinfo");
            return (Criteria) this;
        }

        public Criteria andGiftidIsNull() {
            addCriterion("giftID is null");
            return (Criteria) this;
        }

        public Criteria andGiftidIsNotNull() {
            addCriterion("giftID is not null");
            return (Criteria) this;
        }

        public Criteria andGiftidEqualTo(String value) {
            addCriterion("giftID =", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotEqualTo(String value) {
            addCriterion("giftID <>", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidGreaterThan(String value) {
            addCriterion("giftID >", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidGreaterThanOrEqualTo(String value) {
            addCriterion("giftID >=", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLessThan(String value) {
            addCriterion("giftID <", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLessThanOrEqualTo(String value) {
            addCriterion("giftID <=", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidLike(String value) {
            addCriterion("giftID like", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotLike(String value) {
            addCriterion("giftID not like", value, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidIn(List<String> values) {
            addCriterion("giftID in", values, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotIn(List<String> values) {
            addCriterion("giftID not in", values, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidBetween(String value1, String value2) {
            addCriterion("giftID between", value1, value2, "giftid");
            return (Criteria) this;
        }

        public Criteria andGiftidNotBetween(String value1, String value2) {
            addCriterion("giftID not between", value1, value2, "giftid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}