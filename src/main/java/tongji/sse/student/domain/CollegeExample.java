package tongji.sse.student.domain;

import java.util.ArrayList;
import java.util.List;

public class CollegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollegeExample() {
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHomePageIsNull() {
            addCriterion("home_page is null");
            return (Criteria) this;
        }

        public Criteria andHomePageIsNotNull() {
            addCriterion("home_page is not null");
            return (Criteria) this;
        }

        public Criteria andHomePageEqualTo(String value) {
            addCriterion("home_page =", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageNotEqualTo(String value) {
            addCriterion("home_page <>", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageGreaterThan(String value) {
            addCriterion("home_page >", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageGreaterThanOrEqualTo(String value) {
            addCriterion("home_page >=", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageLessThan(String value) {
            addCriterion("home_page <", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageLessThanOrEqualTo(String value) {
            addCriterion("home_page <=", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageLike(String value) {
            addCriterion("home_page like", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageNotLike(String value) {
            addCriterion("home_page not like", value, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageIn(List<String> values) {
            addCriterion("home_page in", values, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageNotIn(List<String> values) {
            addCriterion("home_page not in", values, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageBetween(String value1, String value2) {
            addCriterion("home_page between", value1, value2, "homePage");
            return (Criteria) this;
        }

        public Criteria andHomePageNotBetween(String value1, String value2) {
            addCriterion("home_page not between", value1, value2, "homePage");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateIsNull() {
            addCriterion("established_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateIsNotNull() {
            addCriterion("established_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateEqualTo(Integer value) {
            addCriterion("established_date =", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateNotEqualTo(Integer value) {
            addCriterion("established_date <>", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateGreaterThan(Integer value) {
            addCriterion("established_date >", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("established_date >=", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateLessThan(Integer value) {
            addCriterion("established_date <", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateLessThanOrEqualTo(Integer value) {
            addCriterion("established_date <=", value, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateIn(List<Integer> values) {
            addCriterion("established_date in", values, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateNotIn(List<Integer> values) {
            addCriterion("established_date not in", values, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateBetween(Integer value1, Integer value2) {
            addCriterion("established_date between", value1, value2, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andEstablishedDateNotBetween(Integer value1, Integer value2) {
            addCriterion("established_date not between", value1, value2, "establishedDate");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadIsNull() {
            addCriterion("department_head is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadIsNotNull() {
            addCriterion("department_head is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadEqualTo(String value) {
            addCriterion("department_head =", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadNotEqualTo(String value) {
            addCriterion("department_head <>", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadGreaterThan(String value) {
            addCriterion("department_head >", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadGreaterThanOrEqualTo(String value) {
            addCriterion("department_head >=", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadLessThan(String value) {
            addCriterion("department_head <", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadLessThanOrEqualTo(String value) {
            addCriterion("department_head <=", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadLike(String value) {
            addCriterion("department_head like", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadNotLike(String value) {
            addCriterion("department_head not like", value, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadIn(List<String> values) {
            addCriterion("department_head in", values, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadNotIn(List<String> values) {
            addCriterion("department_head not in", values, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadBetween(String value1, String value2) {
            addCriterion("department_head between", value1, value2, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andDepartmentHeadNotBetween(String value1, String value2) {
            addCriterion("department_head not between", value1, value2, "departmentHead");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
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