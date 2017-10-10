package xp.us.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsListExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andNewnameIsNull() {
            addCriterion("newname is null");
            return (Criteria) this;
        }

        public Criteria andNewnameIsNotNull() {
            addCriterion("newname is not null");
            return (Criteria) this;
        }

        public Criteria andNewnameEqualTo(String value) {
            addCriterion("newname =", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotEqualTo(String value) {
            addCriterion("newname <>", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameGreaterThan(String value) {
            addCriterion("newname >", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameGreaterThanOrEqualTo(String value) {
            addCriterion("newname >=", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLessThan(String value) {
            addCriterion("newname <", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLessThanOrEqualTo(String value) {
            addCriterion("newname <=", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameLike(String value) {
            addCriterion("newname like", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotLike(String value) {
            addCriterion("newname not like", value, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameIn(List<String> values) {
            addCriterion("newname in", values, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotIn(List<String> values) {
            addCriterion("newname not in", values, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameBetween(String value1, String value2) {
            addCriterion("newname between", value1, value2, "newname");
            return (Criteria) this;
        }

        public Criteria andNewnameNotBetween(String value1, String value2) {
            addCriterion("newname not between", value1, value2, "newname");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNull() {
            addCriterion("newdate is null");
            return (Criteria) this;
        }

        public Criteria andNewdateIsNotNull() {
            addCriterion("newdate is not null");
            return (Criteria) this;
        }

        public Criteria andNewdateEqualTo(Date value) {
            addCriterionForJDBCDate("newdate =", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("newdate <>", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThan(Date value) {
            addCriterionForJDBCDate("newdate >", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newdate >=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThan(Date value) {
            addCriterionForJDBCDate("newdate <", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newdate <=", value, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateIn(List<Date> values) {
            addCriterionForJDBCDate("newdate in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("newdate not in", values, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newdate between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newdate not between", value1, value2, "newdate");
            return (Criteria) this;
        }

        public Criteria andNewtextIsNull() {
            addCriterion("newtext is null");
            return (Criteria) this;
        }

        public Criteria andNewtextIsNotNull() {
            addCriterion("newtext is not null");
            return (Criteria) this;
        }

        public Criteria andNewtextEqualTo(String value) {
            addCriterion("newtext =", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextNotEqualTo(String value) {
            addCriterion("newtext <>", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextGreaterThan(String value) {
            addCriterion("newtext >", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextGreaterThanOrEqualTo(String value) {
            addCriterion("newtext >=", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextLessThan(String value) {
            addCriterion("newtext <", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextLessThanOrEqualTo(String value) {
            addCriterion("newtext <=", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextLike(String value) {
            addCriterion("newtext like", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextNotLike(String value) {
            addCriterion("newtext not like", value, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextIn(List<String> values) {
            addCriterion("newtext in", values, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextNotIn(List<String> values) {
            addCriterion("newtext not in", values, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextBetween(String value1, String value2) {
            addCriterion("newtext between", value1, value2, "newtext");
            return (Criteria) this;
        }

        public Criteria andNewtextNotBetween(String value1, String value2) {
            addCriterion("newtext not between", value1, value2, "newtext");
            return (Criteria) this;
        }

        public Criteria andMaintextIsNull() {
            addCriterion("maintext is null");
            return (Criteria) this;
        }

        public Criteria andMaintextIsNotNull() {
            addCriterion("maintext is not null");
            return (Criteria) this;
        }

        public Criteria andMaintextEqualTo(String value) {
            addCriterion("maintext =", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextNotEqualTo(String value) {
            addCriterion("maintext <>", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextGreaterThan(String value) {
            addCriterion("maintext >", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextGreaterThanOrEqualTo(String value) {
            addCriterion("maintext >=", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextLessThan(String value) {
            addCriterion("maintext <", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextLessThanOrEqualTo(String value) {
            addCriterion("maintext <=", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextLike(String value) {
            addCriterion("maintext like", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextNotLike(String value) {
            addCriterion("maintext not like", value, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextIn(List<String> values) {
            addCriterion("maintext in", values, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextNotIn(List<String> values) {
            addCriterion("maintext not in", values, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextBetween(String value1, String value2) {
            addCriterion("maintext between", value1, value2, "maintext");
            return (Criteria) this;
        }

        public Criteria andMaintextNotBetween(String value1, String value2) {
            addCriterion("maintext not between", value1, value2, "maintext");
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