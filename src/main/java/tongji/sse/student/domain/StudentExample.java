package tongji.sse.student.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNull() {
            addCriterion("student_number is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIsNotNull() {
            addCriterion("student_number is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumberEqualTo(String value) {
            addCriterion("student_number =", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotEqualTo(String value) {
            addCriterion("student_number <>", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThan(String value) {
            addCriterion("student_number >", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("student_number >=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThan(String value) {
            addCriterion("student_number <", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLessThanOrEqualTo(String value) {
            addCriterion("student_number <=", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberLike(String value) {
            addCriterion("student_number like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotLike(String value) {
            addCriterion("student_number not like", value, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberIn(List<String> values) {
            addCriterion("student_number in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotIn(List<String> values) {
            addCriterion("student_number not in", values, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberBetween(String value1, String value2) {
            addCriterion("student_number between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andStudentNumberNotBetween(String value1, String value2) {
            addCriterion("student_number not between", value1, value2, "studentNumber");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNull() {
            addCriterion("student_status is null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIsNotNull() {
            addCriterion("student_status is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStatusEqualTo(String value) {
            addCriterion("student_status =", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotEqualTo(String value) {
            addCriterion("student_status <>", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThan(String value) {
            addCriterion("student_status >", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("student_status >=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThan(String value) {
            addCriterion("student_status <", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLessThanOrEqualTo(String value) {
            addCriterion("student_status <=", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusLike(String value) {
            addCriterion("student_status like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotLike(String value) {
            addCriterion("student_status not like", value, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusIn(List<String> values) {
            addCriterion("student_status in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotIn(List<String> values) {
            addCriterion("student_status not in", values, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusBetween(String value1, String value2) {
            addCriterion("student_status between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andStudentStatusNotBetween(String value1, String value2) {
            addCriterion("student_status not between", value1, value2, "studentStatus");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNull() {
            addCriterion("blood_type is null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIsNotNull() {
            addCriterion("blood_type is not null");
            return (Criteria) this;
        }

        public Criteria andBloodTypeEqualTo(String value) {
            addCriterion("blood_type =", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotEqualTo(String value) {
            addCriterion("blood_type <>", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThan(String value) {
            addCriterion("blood_type >", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blood_type >=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThan(String value) {
            addCriterion("blood_type <", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLessThanOrEqualTo(String value) {
            addCriterion("blood_type <=", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeLike(String value) {
            addCriterion("blood_type like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotLike(String value) {
            addCriterion("blood_type not like", value, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeIn(List<String> values) {
            addCriterion("blood_type in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotIn(List<String> values) {
            addCriterion("blood_type not in", values, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeBetween(String value1, String value2) {
            addCriterion("blood_type between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andBloodTypeNotBetween(String value1, String value2) {
            addCriterion("blood_type not between", value1, value2, "bloodType");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNull() {
            addCriterion("belief is null");
            return (Criteria) this;
        }

        public Criteria andBeliefIsNotNull() {
            addCriterion("belief is not null");
            return (Criteria) this;
        }

        public Criteria andBeliefEqualTo(String value) {
            addCriterion("belief =", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotEqualTo(String value) {
            addCriterion("belief <>", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThan(String value) {
            addCriterion("belief >", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefGreaterThanOrEqualTo(String value) {
            addCriterion("belief >=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThan(String value) {
            addCriterion("belief <", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLessThanOrEqualTo(String value) {
            addCriterion("belief <=", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefLike(String value) {
            addCriterion("belief like", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotLike(String value) {
            addCriterion("belief not like", value, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefIn(List<String> values) {
            addCriterion("belief in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotIn(List<String> values) {
            addCriterion("belief not in", values, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefBetween(String value1, String value2) {
            addCriterion("belief between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andBeliefNotBetween(String value1, String value2) {
            addCriterion("belief not between", value1, value2, "belief");
            return (Criteria) this;
        }

        public Criteria andGpaIsNull() {
            addCriterion("gpa is null");
            return (Criteria) this;
        }

        public Criteria andGpaIsNotNull() {
            addCriterion("gpa is not null");
            return (Criteria) this;
        }

        public Criteria andGpaEqualTo(Double value) {
            addCriterion("gpa =", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotEqualTo(Double value) {
            addCriterion("gpa <>", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaGreaterThan(Double value) {
            addCriterion("gpa >", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaGreaterThanOrEqualTo(Double value) {
            addCriterion("gpa >=", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaLessThan(Double value) {
            addCriterion("gpa <", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaLessThanOrEqualTo(Double value) {
            addCriterion("gpa <=", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaIn(List<Double> values) {
            addCriterion("gpa in", values, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotIn(List<Double> values) {
            addCriterion("gpa not in", values, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaBetween(Double value1, Double value2) {
            addCriterion("gpa between", value1, value2, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotBetween(Double value1, Double value2) {
            addCriterion("gpa not between", value1, value2, "gpa");
            return (Criteria) this;
        }

        public Criteria andAvatorIsNull() {
            addCriterion("avator is null");
            return (Criteria) this;
        }

        public Criteria andAvatorIsNotNull() {
            addCriterion("avator is not null");
            return (Criteria) this;
        }

        public Criteria andAvatorEqualTo(String value) {
            addCriterion("avator =", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotEqualTo(String value) {
            addCriterion("avator <>", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorGreaterThan(String value) {
            addCriterion("avator >", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorGreaterThanOrEqualTo(String value) {
            addCriterion("avator >=", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorLessThan(String value) {
            addCriterion("avator <", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorLessThanOrEqualTo(String value) {
            addCriterion("avator <=", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorLike(String value) {
            addCriterion("avator like", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotLike(String value) {
            addCriterion("avator not like", value, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorIn(List<String> values) {
            addCriterion("avator in", values, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotIn(List<String> values) {
            addCriterion("avator not in", values, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorBetween(String value1, String value2) {
            addCriterion("avator between", value1, value2, "avator");
            return (Criteria) this;
        }

        public Criteria andAvatorNotBetween(String value1, String value2) {
            addCriterion("avator not between", value1, value2, "avator");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andRecruitWayIsNull() {
            addCriterion("recruit_way is null");
            return (Criteria) this;
        }

        public Criteria andRecruitWayIsNotNull() {
            addCriterion("recruit_way is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitWayEqualTo(String value) {
            addCriterion("recruit_way =", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayNotEqualTo(String value) {
            addCriterion("recruit_way <>", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayGreaterThan(String value) {
            addCriterion("recruit_way >", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayGreaterThanOrEqualTo(String value) {
            addCriterion("recruit_way >=", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayLessThan(String value) {
            addCriterion("recruit_way <", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayLessThanOrEqualTo(String value) {
            addCriterion("recruit_way <=", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayLike(String value) {
            addCriterion("recruit_way like", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayNotLike(String value) {
            addCriterion("recruit_way not like", value, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayIn(List<String> values) {
            addCriterion("recruit_way in", values, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayNotIn(List<String> values) {
            addCriterion("recruit_way not in", values, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayBetween(String value1, String value2) {
            addCriterion("recruit_way between", value1, value2, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andRecruitWayNotBetween(String value1, String value2) {
            addCriterion("recruit_way not between", value1, value2, "recruitWay");
            return (Criteria) this;
        }

        public Criteria andCommitYearIsNull() {
            addCriterion("commit_year is null");
            return (Criteria) this;
        }

        public Criteria andCommitYearIsNotNull() {
            addCriterion("commit_year is not null");
            return (Criteria) this;
        }

        public Criteria andCommitYearEqualTo(Integer value) {
            addCriterion("commit_year =", value, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearNotEqualTo(Integer value) {
            addCriterion("commit_year <>", value, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearGreaterThan(Integer value) {
            addCriterion("commit_year >", value, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("commit_year >=", value, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearLessThan(Integer value) {
            addCriterion("commit_year <", value, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearLessThanOrEqualTo(Integer value) {
            addCriterion("commit_year <=", value, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearIn(List<Integer> values) {
            addCriterion("commit_year in", values, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearNotIn(List<Integer> values) {
            addCriterion("commit_year not in", values, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearBetween(Integer value1, Integer value2) {
            addCriterion("commit_year between", value1, value2, "commitYear");
            return (Criteria) this;
        }

        public Criteria andCommitYearNotBetween(Integer value1, Integer value2) {
            addCriterion("commit_year not between", value1, value2, "commitYear");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIsNull() {
            addCriterion("identity_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIsNotNull() {
            addCriterion("identity_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberEqualTo(String value) {
            addCriterion("identity_number =", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotEqualTo(String value) {
            addCriterion("identity_number <>", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberGreaterThan(String value) {
            addCriterion("identity_number >", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identity_number >=", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLessThan(String value) {
            addCriterion("identity_number <", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLessThanOrEqualTo(String value) {
            addCriterion("identity_number <=", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLike(String value) {
            addCriterion("identity_number like", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotLike(String value) {
            addCriterion("identity_number not like", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIn(List<String> values) {
            addCriterion("identity_number in", values, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotIn(List<String> values) {
            addCriterion("identity_number not in", values, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberBetween(String value1, String value2) {
            addCriterion("identity_number between", value1, value2, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotBetween(String value1, String value2) {
            addCriterion("identity_number not between", value1, value2, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressIsNull() {
            addCriterion("permanent_address is null");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressIsNotNull() {
            addCriterion("permanent_address is not null");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressEqualTo(String value) {
            addCriterion("permanent_address =", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotEqualTo(String value) {
            addCriterion("permanent_address <>", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressGreaterThan(String value) {
            addCriterion("permanent_address >", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("permanent_address >=", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressLessThan(String value) {
            addCriterion("permanent_address <", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressLessThanOrEqualTo(String value) {
            addCriterion("permanent_address <=", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressLike(String value) {
            addCriterion("permanent_address like", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotLike(String value) {
            addCriterion("permanent_address not like", value, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressIn(List<String> values) {
            addCriterion("permanent_address in", values, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotIn(List<String> values) {
            addCriterion("permanent_address not in", values, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressBetween(String value1, String value2) {
            addCriterion("permanent_address between", value1, value2, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andPermanentAddressNotBetween(String value1, String value2) {
            addCriterion("permanent_address not between", value1, value2, "permanentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNull() {
            addCriterion("current_address is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNotNull() {
            addCriterion("current_address is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressEqualTo(String value) {
            addCriterion("current_address =", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotEqualTo(String value) {
            addCriterion("current_address <>", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThan(String value) {
            addCriterion("current_address >", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("current_address >=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThan(String value) {
            addCriterion("current_address <", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThanOrEqualTo(String value) {
            addCriterion("current_address <=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLike(String value) {
            addCriterion("current_address like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotLike(String value) {
            addCriterion("current_address not like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIn(List<String> values) {
            addCriterion("current_address in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotIn(List<String> values) {
            addCriterion("current_address not in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressBetween(String value1, String value2) {
            addCriterion("current_address between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotBetween(String value1, String value2) {
            addCriterion("current_address not between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
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