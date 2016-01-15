package com.hbc.api.trade.order.mapping.gen;

import com.hbc.api.trade.order.mapping.gen.bean.OrderLog;
import com.hbc.api.trade.order.mapping.gen.bean.OrderLogExample.Criteria;
import com.hbc.api.trade.order.mapping.gen.bean.OrderLogExample.Criterion;
import com.hbc.api.trade.order.mapping.gen.bean.OrderLogExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class OrderLogSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String countByExample(OrderLogExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`trade_order_log`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String deleteByExample(OrderLogExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`trade_order_log`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String insertSelective(OrderLog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`trade_order_log`");
        
        if (record.getLogId() != null) {
            sql.VALUES("log_id", "#{logId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideId() != null) {
            sql.VALUES("guide_id", "#{guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideName() != null) {
            sql.VALUES("guide_name", "#{guideName,jdbcType=VARCHAR}");
        }
        
        if (record.getLogType() != null) {
            sql.VALUES("log_type", "#{logType,jdbcType=INTEGER}");
        }
        
        if (record.getOpType() != null) {
            sql.VALUES("op_type", "#{opType,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.VALUES("comment", "#{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getOpUserId() != null) {
            sql.VALUES("op_user_id", "#{opUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpUserName() != null) {
            sql.VALUES("op_user_name", "#{opUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String selectByExample(OrderLogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("log_id");
        } else {
            sql.SELECT("log_id");
        }
        sql.SELECT("order_no");
        sql.SELECT("guide_id");
        sql.SELECT("guide_name");
        sql.SELECT("log_type");
        sql.SELECT("op_type");
        sql.SELECT("content");
        sql.SELECT("comment");
        sql.SELECT("op_user_id");
        sql.SELECT("op_user_name");
        sql.SELECT("update_time");
        sql.SELECT("create_time");
        sql.FROM("`trade_order_log`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        OrderLog record = (OrderLog) parameter.get("record");
        OrderLogExample example = (OrderLogExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`trade_order_log`");
        
        if (record.getLogId() != null) {
            sql.SET("log_id = #{record.logId,jdbcType=INTEGER}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideId() != null) {
            sql.SET("guide_id = #{record.guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideName() != null) {
            sql.SET("guide_name = #{record.guideName,jdbcType=VARCHAR}");
        }
        
        if (record.getLogType() != null) {
            sql.SET("log_type = #{record.logType,jdbcType=INTEGER}");
        }
        
        if (record.getOpType() != null) {
            sql.SET("op_type = #{record.opType,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("comment = #{record.comment,jdbcType=VARCHAR}");
        }
        
        if (record.getOpUserId() != null) {
            sql.SET("op_user_id = #{record.opUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpUserName() != null) {
            sql.SET("op_user_name = #{record.opUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_order_log`");
        
        sql.SET("log_id = #{record.logId,jdbcType=INTEGER}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("guide_id = #{record.guideId,jdbcType=VARCHAR}");
        sql.SET("guide_name = #{record.guideName,jdbcType=VARCHAR}");
        sql.SET("log_type = #{record.logType,jdbcType=INTEGER}");
        sql.SET("op_type = #{record.opType,jdbcType=INTEGER}");
        sql.SET("content = #{record.content,jdbcType=VARCHAR}");
        sql.SET("comment = #{record.comment,jdbcType=VARCHAR}");
        sql.SET("op_user_id = #{record.opUserId,jdbcType=VARCHAR}");
        sql.SET("op_user_name = #{record.opUserName,jdbcType=VARCHAR}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        OrderLogExample example = (OrderLogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(OrderLog record) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_order_log`");
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideId() != null) {
            sql.SET("guide_id = #{guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getGuideName() != null) {
            sql.SET("guide_name = #{guideName,jdbcType=VARCHAR}");
        }
        
        if (record.getLogType() != null) {
            sql.SET("log_type = #{logType,jdbcType=INTEGER}");
        }
        
        if (record.getOpType() != null) {
            sql.SET("op_type = #{opType,jdbcType=INTEGER}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=VARCHAR}");
        }
        
        if (record.getComment() != null) {
            sql.SET("comment = #{comment,jdbcType=VARCHAR}");
        }
        
        if (record.getOpUserId() != null) {
            sql.SET("op_user_id = #{opUserId,jdbcType=VARCHAR}");
        }
        
        if (record.getOpUserName() != null) {
            sql.SET("op_user_name = #{opUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("log_id = #{logId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_order_log`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, OrderLogExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}