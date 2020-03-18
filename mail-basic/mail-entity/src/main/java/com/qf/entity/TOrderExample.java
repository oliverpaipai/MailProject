package com.qf.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andCarryIsNull() {
            addCriterion("carry is null");
            return (Criteria) this;
        }

        public Criteria andCarryIsNotNull() {
            addCriterion("carry is not null");
            return (Criteria) this;
        }

        public Criteria andCarryEqualTo(Integer value) {
            addCriterion("carry =", value, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryNotEqualTo(Integer value) {
            addCriterion("carry <>", value, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryGreaterThan(Integer value) {
            addCriterion("carry >", value, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryGreaterThanOrEqualTo(Integer value) {
            addCriterion("carry >=", value, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryLessThan(Integer value) {
            addCriterion("carry <", value, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryLessThanOrEqualTo(Integer value) {
            addCriterion("carry <=", value, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryIn(List<Integer> values) {
            addCriterion("carry in", values, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryNotIn(List<Integer> values) {
            addCriterion("carry not in", values, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryBetween(Integer value1, Integer value2) {
            addCriterion("carry between", value1, value2, "carry");
            return (Criteria) this;
        }

        public Criteria andCarryNotBetween(Integer value1, Integer value2) {
            addCriterion("carry not between", value1, value2, "carry");
            return (Criteria) this;
        }

        public Criteria andRebateIsNull() {
            addCriterion("rebate is null");
            return (Criteria) this;
        }

        public Criteria andRebateIsNotNull() {
            addCriterion("rebate is not null");
            return (Criteria) this;
        }

        public Criteria andRebateEqualTo(BigDecimal value) {
            addCriterion("rebate =", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotEqualTo(BigDecimal value) {
            addCriterion("rebate <>", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThan(BigDecimal value) {
            addCriterion("rebate >", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate >=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThan(BigDecimal value) {
            addCriterion("rebate <", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rebate <=", value, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateIn(List<BigDecimal> values) {
            addCriterion("rebate in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotIn(List<BigDecimal> values) {
            addCriterion("rebate not in", values, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andRebateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rebate not between", value1, value2, "rebate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNull() {
            addCriterion("refundStatus is null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIsNotNull() {
            addCriterion("refundStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRefundstatusEqualTo(String value) {
            addCriterion("refundStatus =", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotEqualTo(String value) {
            addCriterion("refundStatus <>", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThan(String value) {
            addCriterion("refundStatus >", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusGreaterThanOrEqualTo(String value) {
            addCriterion("refundStatus >=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThan(String value) {
            addCriterion("refundStatus <", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLessThanOrEqualTo(String value) {
            addCriterion("refundStatus <=", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusLike(String value) {
            addCriterion("refundStatus like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotLike(String value) {
            addCriterion("refundStatus not like", value, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusIn(List<String> values) {
            addCriterion("refundStatus in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotIn(List<String> values) {
            addCriterion("refundStatus not in", values, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusBetween(String value1, String value2) {
            addCriterion("refundStatus between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andRefundstatusNotBetween(String value1, String value2) {
            addCriterion("refundStatus not between", value1, value2, "refundstatus");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andPtotalIsNull() {
            addCriterion("ptotal is null");
            return (Criteria) this;
        }

        public Criteria andPtotalIsNotNull() {
            addCriterion("ptotal is not null");
            return (Criteria) this;
        }

        public Criteria andPtotalEqualTo(BigDecimal value) {
            addCriterion("ptotal =", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotEqualTo(BigDecimal value) {
            addCriterion("ptotal <>", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalGreaterThan(BigDecimal value) {
            addCriterion("ptotal >", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ptotal >=", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalLessThan(BigDecimal value) {
            addCriterion("ptotal <", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ptotal <=", value, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalIn(List<BigDecimal> values) {
            addCriterion("ptotal in", values, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotIn(List<BigDecimal> values) {
            addCriterion("ptotal not in", values, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ptotal between", value1, value2, "ptotal");
            return (Criteria) this;
        }

        public Criteria andPtotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ptotal not between", value1, value2, "ptotal");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("paystatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("paystatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(String value) {
            addCriterion("paystatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(String value) {
            addCriterion("paystatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(String value) {
            addCriterion("paystatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("paystatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(String value) {
            addCriterion("paystatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(String value) {
            addCriterion("paystatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLike(String value) {
            addCriterion("paystatus like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotLike(String value) {
            addCriterion("paystatus not like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<String> values) {
            addCriterion("paystatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<String> values) {
            addCriterion("paystatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(String value1, String value2) {
            addCriterion("paystatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(String value1, String value2) {
            addCriterion("paystatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andUpdateamountIsNull() {
            addCriterion("updateAmount is null");
            return (Criteria) this;
        }

        public Criteria andUpdateamountIsNotNull() {
            addCriterion("updateAmount is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateamountEqualTo(String value) {
            addCriterion("updateAmount =", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountNotEqualTo(String value) {
            addCriterion("updateAmount <>", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountGreaterThan(String value) {
            addCriterion("updateAmount >", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountGreaterThanOrEqualTo(String value) {
            addCriterion("updateAmount >=", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountLessThan(String value) {
            addCriterion("updateAmount <", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountLessThanOrEqualTo(String value) {
            addCriterion("updateAmount <=", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountLike(String value) {
            addCriterion("updateAmount like", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountNotLike(String value) {
            addCriterion("updateAmount not like", value, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountIn(List<String> values) {
            addCriterion("updateAmount in", values, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountNotIn(List<String> values) {
            addCriterion("updateAmount not in", values, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountBetween(String value1, String value2) {
            addCriterion("updateAmount between", value1, value2, "updateamount");
            return (Criteria) this;
        }

        public Criteria andUpdateamountNotBetween(String value1, String value2) {
            addCriterion("updateAmount not between", value1, value2, "updateamount");
            return (Criteria) this;
        }

        public Criteria andExpresscodeIsNull() {
            addCriterion("expressCode is null");
            return (Criteria) this;
        }

        public Criteria andExpresscodeIsNotNull() {
            addCriterion("expressCode is not null");
            return (Criteria) this;
        }

        public Criteria andExpresscodeEqualTo(String value) {
            addCriterion("expressCode =", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeNotEqualTo(String value) {
            addCriterion("expressCode <>", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeGreaterThan(String value) {
            addCriterion("expressCode >", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeGreaterThanOrEqualTo(String value) {
            addCriterion("expressCode >=", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeLessThan(String value) {
            addCriterion("expressCode <", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeLessThanOrEqualTo(String value) {
            addCriterion("expressCode <=", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeLike(String value) {
            addCriterion("expressCode like", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeNotLike(String value) {
            addCriterion("expressCode not like", value, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeIn(List<String> values) {
            addCriterion("expressCode in", values, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeNotIn(List<String> values) {
            addCriterion("expressCode not in", values, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeBetween(String value1, String value2) {
            addCriterion("expressCode between", value1, value2, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpresscodeNotBetween(String value1, String value2) {
            addCriterion("expressCode not between", value1, value2, "expresscode");
            return (Criteria) this;
        }

        public Criteria andExpressnameIsNull() {
            addCriterion("expressName is null");
            return (Criteria) this;
        }

        public Criteria andExpressnameIsNotNull() {
            addCriterion("expressName is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnameEqualTo(String value) {
            addCriterion("expressName =", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotEqualTo(String value) {
            addCriterion("expressName <>", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameGreaterThan(String value) {
            addCriterion("expressName >", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameGreaterThanOrEqualTo(String value) {
            addCriterion("expressName >=", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLessThan(String value) {
            addCriterion("expressName <", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLessThanOrEqualTo(String value) {
            addCriterion("expressName <=", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameLike(String value) {
            addCriterion("expressName like", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotLike(String value) {
            addCriterion("expressName not like", value, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameIn(List<String> values) {
            addCriterion("expressName in", values, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotIn(List<String> values) {
            addCriterion("expressName not in", values, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameBetween(String value1, String value2) {
            addCriterion("expressName between", value1, value2, "expressname");
            return (Criteria) this;
        }

        public Criteria andExpressnameNotBetween(String value1, String value2) {
            addCriterion("expressName not between", value1, value2, "expressname");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementIsNull() {
            addCriterion("otherRequirement is null");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementIsNotNull() {
            addCriterion("otherRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementEqualTo(String value) {
            addCriterion("otherRequirement =", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementNotEqualTo(String value) {
            addCriterion("otherRequirement <>", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementGreaterThan(String value) {
            addCriterion("otherRequirement >", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementGreaterThanOrEqualTo(String value) {
            addCriterion("otherRequirement >=", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementLessThan(String value) {
            addCriterion("otherRequirement <", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementLessThanOrEqualTo(String value) {
            addCriterion("otherRequirement <=", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementLike(String value) {
            addCriterion("otherRequirement like", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementNotLike(String value) {
            addCriterion("otherRequirement not like", value, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementIn(List<String> values) {
            addCriterion("otherRequirement in", values, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementNotIn(List<String> values) {
            addCriterion("otherRequirement not in", values, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementBetween(String value1, String value2) {
            addCriterion("otherRequirement between", value1, value2, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andOtherrequirementNotBetween(String value1, String value2) {
            addCriterion("otherRequirement not between", value1, value2, "otherrequirement");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNull() {
            addCriterion("expressNo is null");
            return (Criteria) this;
        }

        public Criteria andExpressnoIsNotNull() {
            addCriterion("expressNo is not null");
            return (Criteria) this;
        }

        public Criteria andExpressnoEqualTo(String value) {
            addCriterion("expressNo =", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotEqualTo(String value) {
            addCriterion("expressNo <>", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThan(String value) {
            addCriterion("expressNo >", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoGreaterThanOrEqualTo(String value) {
            addCriterion("expressNo >=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThan(String value) {
            addCriterion("expressNo <", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLessThanOrEqualTo(String value) {
            addCriterion("expressNo <=", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoLike(String value) {
            addCriterion("expressNo like", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotLike(String value) {
            addCriterion("expressNo not like", value, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoIn(List<String> values) {
            addCriterion("expressNo in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotIn(List<String> values) {
            addCriterion("expressNo not in", values, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoBetween(String value1, String value2) {
            addCriterion("expressNo between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpressnoNotBetween(String value1, String value2) {
            addCriterion("expressNo not between", value1, value2, "expressno");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameIsNull() {
            addCriterion("expressCompanyName is null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameIsNotNull() {
            addCriterion("expressCompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameEqualTo(String value) {
            addCriterion("expressCompanyName =", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameNotEqualTo(String value) {
            addCriterion("expressCompanyName <>", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameGreaterThan(String value) {
            addCriterion("expressCompanyName >", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("expressCompanyName >=", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameLessThan(String value) {
            addCriterion("expressCompanyName <", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameLessThanOrEqualTo(String value) {
            addCriterion("expressCompanyName <=", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameLike(String value) {
            addCriterion("expressCompanyName like", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameNotLike(String value) {
            addCriterion("expressCompanyName not like", value, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameIn(List<String> values) {
            addCriterion("expressCompanyName in", values, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameNotIn(List<String> values) {
            addCriterion("expressCompanyName not in", values, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameBetween(String value1, String value2) {
            addCriterion("expressCompanyName between", value1, value2, "expresscompanyname");
            return (Criteria) this;
        }

        public Criteria andExpresscompanynameNotBetween(String value1, String value2) {
            addCriterion("expressCompanyName not between", value1, value2, "expresscompanyname");
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

        public Criteria andConfirmsendproductremarkIsNull() {
            addCriterion("confirmSendProductRemark is null");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkIsNotNull() {
            addCriterion("confirmSendProductRemark is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkEqualTo(String value) {
            addCriterion("confirmSendProductRemark =", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkNotEqualTo(String value) {
            addCriterion("confirmSendProductRemark <>", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkGreaterThan(String value) {
            addCriterion("confirmSendProductRemark >", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkGreaterThanOrEqualTo(String value) {
            addCriterion("confirmSendProductRemark >=", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkLessThan(String value) {
            addCriterion("confirmSendProductRemark <", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkLessThanOrEqualTo(String value) {
            addCriterion("confirmSendProductRemark <=", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkLike(String value) {
            addCriterion("confirmSendProductRemark like", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkNotLike(String value) {
            addCriterion("confirmSendProductRemark not like", value, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkIn(List<String> values) {
            addCriterion("confirmSendProductRemark in", values, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkNotIn(List<String> values) {
            addCriterion("confirmSendProductRemark not in", values, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkBetween(String value1, String value2) {
            addCriterion("confirmSendProductRemark between", value1, value2, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andConfirmsendproductremarkNotBetween(String value1, String value2) {
            addCriterion("confirmSendProductRemark not between", value1, value2, "confirmsendproductremark");
            return (Criteria) this;
        }

        public Criteria andClosedcommentIsNull() {
            addCriterion("closedComment is null");
            return (Criteria) this;
        }

        public Criteria andClosedcommentIsNotNull() {
            addCriterion("closedComment is not null");
            return (Criteria) this;
        }

        public Criteria andClosedcommentEqualTo(String value) {
            addCriterion("closedComment =", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentNotEqualTo(String value) {
            addCriterion("closedComment <>", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentGreaterThan(String value) {
            addCriterion("closedComment >", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentGreaterThanOrEqualTo(String value) {
            addCriterion("closedComment >=", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentLessThan(String value) {
            addCriterion("closedComment <", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentLessThanOrEqualTo(String value) {
            addCriterion("closedComment <=", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentLike(String value) {
            addCriterion("closedComment like", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentNotLike(String value) {
            addCriterion("closedComment not like", value, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentIn(List<String> values) {
            addCriterion("closedComment in", values, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentNotIn(List<String> values) {
            addCriterion("closedComment not in", values, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentBetween(String value1, String value2) {
            addCriterion("closedComment between", value1, value2, "closedcomment");
            return (Criteria) this;
        }

        public Criteria andClosedcommentNotBetween(String value1, String value2) {
            addCriterion("closedComment not between", value1, value2, "closedcomment");
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