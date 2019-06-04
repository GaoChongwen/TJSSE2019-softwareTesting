package tongji.sse.student.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentInClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentInClassesExample() {
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

        public Criteria andStudentUserIdIsNull() {
            addCriterion("student_user_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdIsNotNull() {
            addCriterion("student_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdEqualTo(Integer value) {
            addCriterion("student_user_id =", value, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdNotEqualTo(Integer value) {
            addCriterion("student_user_id <>", value, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdGreaterThan(Integer value) {
            addCriterion("student_user_id >", value, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_user_id >=", value, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdLessThan(Integer value) {
            addCriterion("student_user_id <", value, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_user_id <=", value, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdIn(List<Integer> values) {
            addCriterion("student_user_id in", values, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdNotIn(List<Integer> values) {
            addCriterion("student_user_id not in", values, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdBetween(Integer value1, Integer value2) {
            addCriterion("student_user_id between", value1, value2, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andStudentUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_user_id not between", value1, value2, "studentUserId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdIsNull() {
            addCriterion("classes_college_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdIsNotNull() {
            addCriterion("classes_college_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdEqualTo(Integer value) {
            addCriterion("classes_college_id =", value, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdNotEqualTo(Integer value) {
            addCriterion("classes_college_id <>", value, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdGreaterThan(Integer value) {
            addCriterion("classes_college_id >", value, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_college_id >=", value, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdLessThan(Integer value) {
            addCriterion("classes_college_id <", value, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_college_id <=", value, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdIn(List<Integer> values) {
            addCriterion("classes_college_id in", values, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdNotIn(List<Integer> values) {
            addCriterion("classes_college_id not in", values, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_college_id between", value1, value2, "classesCollegeId");
            return (Criteria) this;
        }

        public Criteria andClassesCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_college_id not between", value1, value2, "classesCollegeId");
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