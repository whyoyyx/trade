package com.hbc.api.trade.order.mapping.gen;

import com.hbc.api.trade.order.mapping.gen.bean.TradeAdditionalDetail;
import com.hbc.api.trade.order.mapping.gen.bean.TradeAdditionalDetailExample.Criteria;
import com.hbc.api.trade.order.mapping.gen.bean.TradeAdditionalDetailExample.Criterion;
import com.hbc.api.trade.order.mapping.gen.bean.TradeAdditionalDetailExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TradeAdditionalDetailSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String countByExample(TradeAdditionalDetailExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`trade_additional_detail`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String deleteByExample(TradeAdditionalDetailExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`trade_additional_detail`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String insertSelective(TradeAdditionalDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`trade_additional_detail`");
        
        if (record.getDetailId() != null) {
            sql.VALUES("detail_id", "#{detailId,jdbcType=VARCHAR}");
        }
        
        if (record.getAdditionalId() != null) {
            sql.VALUES("additional_id", "#{additionalId,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyDate() != null) {
            sql.VALUES("daily_date", "#{dailyDate,jdbcType=DATE}");
        }
        
        if (record.getOverTime() != null) {
            sql.VALUES("over_time", "#{overTime,jdbcType=INTEGER}");
        }
        
        if (record.getOverTimePrice() != null) {
            sql.VALUES("over_time_price", "#{overTimePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitTimePrice() != null) {
            sql.VALUES("unit_time_price", "#{unitTimePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDistance() != null) {
            sql.VALUES("over_distance", "#{overDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDistancePrice() != null) {
            sql.VALUES("over_distance_price", "#{overDistancePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitDistancePrice() != null) {
            sql.VALUES("unit_distance_price", "#{unitDistancePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDay() != null) {
            sql.VALUES("over_day", "#{overDay,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDayPrice() != null) {
            sql.VALUES("over_day_price", "#{overDayPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitDayPrice() != null) {
            sql.VALUES("unit_day_price", "#{unitDayPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverWaitTimeCost() != null) {
            sql.VALUES("over_wait_time_cost", "#{overWaitTimeCost,jdbcType=DOUBLE}");
        }
        
        if (record.getOtherFee1() != null) {
            sql.VALUES("other_fee1", "#{otherFee1,jdbcType=DOUBLE}");
        }
        
        if (record.getOtherFee2() != null) {
            sql.VALUES("other_fee2", "#{otherFee2,jdbcType=DOUBLE}");
        }
        
        if (record.getApplyfee() != null) {
            sql.VALUES("applyFee", "#{applyfee,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOverTime() != null) {
            sql.VALUES("cfm_over_time", "#{cfmOverTime,jdbcType=INTEGER}");
        }
        
        if (record.getCfmOverDistance() != null) {
            sql.VALUES("cfm_over_distance", "#{cfmOverDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOverDay() != null) {
            sql.VALUES("cfm_over_day", "#{cfmOverDay,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOtherFee1() != null) {
            sql.VALUES("cfm_other_fee1", "#{cfmOtherFee1,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOtherFee2() != null) {
            sql.VALUES("cfm_other_fee2", "#{cfmOtherFee2,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmFee() != null) {
            sql.VALUES("cfm_fee", "#{cfmFee,jdbcType=DOUBLE}");
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
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String selectByExample(TradeAdditionalDetailExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("detail_id");
        } else {
            sql.SELECT("detail_id");
        }
        sql.SELECT("additional_id");
        sql.SELECT("daily_date");
        sql.SELECT("over_time");
        sql.SELECT("over_time_price");
        sql.SELECT("unit_time_price");
        sql.SELECT("over_distance");
        sql.SELECT("over_distance_price");
        sql.SELECT("unit_distance_price");
        sql.SELECT("over_day");
        sql.SELECT("over_day_price");
        sql.SELECT("unit_day_price");
        sql.SELECT("over_wait_time_cost");
        sql.SELECT("other_fee1");
        sql.SELECT("other_fee2");
        sql.SELECT("applyFee");
        sql.SELECT("cfm_over_time");
        sql.SELECT("cfm_over_distance");
        sql.SELECT("cfm_over_day");
        sql.SELECT("cfm_other_fee1");
        sql.SELECT("cfm_other_fee2");
        sql.SELECT("cfm_fee");
        sql.SELECT("update_time");
        sql.SELECT("create_time");
        sql.FROM("`trade_additional_detail`");
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
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TradeAdditionalDetail record = (TradeAdditionalDetail) parameter.get("record");
        TradeAdditionalDetailExample example = (TradeAdditionalDetailExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`trade_additional_detail`");
        
        if (record.getDetailId() != null) {
            sql.SET("detail_id = #{record.detailId,jdbcType=VARCHAR}");
        }
        
        if (record.getAdditionalId() != null) {
            sql.SET("additional_id = #{record.additionalId,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyDate() != null) {
            sql.SET("daily_date = #{record.dailyDate,jdbcType=DATE}");
        }
        
        if (record.getOverTime() != null) {
            sql.SET("over_time = #{record.overTime,jdbcType=INTEGER}");
        }
        
        if (record.getOverTimePrice() != null) {
            sql.SET("over_time_price = #{record.overTimePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitTimePrice() != null) {
            sql.SET("unit_time_price = #{record.unitTimePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDistance() != null) {
            sql.SET("over_distance = #{record.overDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDistancePrice() != null) {
            sql.SET("over_distance_price = #{record.overDistancePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitDistancePrice() != null) {
            sql.SET("unit_distance_price = #{record.unitDistancePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDay() != null) {
            sql.SET("over_day = #{record.overDay,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDayPrice() != null) {
            sql.SET("over_day_price = #{record.overDayPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitDayPrice() != null) {
            sql.SET("unit_day_price = #{record.unitDayPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverWaitTimeCost() != null) {
            sql.SET("over_wait_time_cost = #{record.overWaitTimeCost,jdbcType=DOUBLE}");
        }
        
        if (record.getOtherFee1() != null) {
            sql.SET("other_fee1 = #{record.otherFee1,jdbcType=DOUBLE}");
        }
        
        if (record.getOtherFee2() != null) {
            sql.SET("other_fee2 = #{record.otherFee2,jdbcType=DOUBLE}");
        }
        
        if (record.getApplyfee() != null) {
            sql.SET("applyFee = #{record.applyfee,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOverTime() != null) {
            sql.SET("cfm_over_time = #{record.cfmOverTime,jdbcType=INTEGER}");
        }
        
        if (record.getCfmOverDistance() != null) {
            sql.SET("cfm_over_distance = #{record.cfmOverDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOverDay() != null) {
            sql.SET("cfm_over_day = #{record.cfmOverDay,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOtherFee1() != null) {
            sql.SET("cfm_other_fee1 = #{record.cfmOtherFee1,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOtherFee2() != null) {
            sql.SET("cfm_other_fee2 = #{record.cfmOtherFee2,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmFee() != null) {
            sql.SET("cfm_fee = #{record.cfmFee,jdbcType=DOUBLE}");
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
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_additional_detail`");
        
        sql.SET("detail_id = #{record.detailId,jdbcType=VARCHAR}");
        sql.SET("additional_id = #{record.additionalId,jdbcType=VARCHAR}");
        sql.SET("daily_date = #{record.dailyDate,jdbcType=DATE}");
        sql.SET("over_time = #{record.overTime,jdbcType=INTEGER}");
        sql.SET("over_time_price = #{record.overTimePrice,jdbcType=DOUBLE}");
        sql.SET("unit_time_price = #{record.unitTimePrice,jdbcType=DOUBLE}");
        sql.SET("over_distance = #{record.overDistance,jdbcType=DOUBLE}");
        sql.SET("over_distance_price = #{record.overDistancePrice,jdbcType=DOUBLE}");
        sql.SET("unit_distance_price = #{record.unitDistancePrice,jdbcType=DOUBLE}");
        sql.SET("over_day = #{record.overDay,jdbcType=DOUBLE}");
        sql.SET("over_day_price = #{record.overDayPrice,jdbcType=DOUBLE}");
        sql.SET("unit_day_price = #{record.unitDayPrice,jdbcType=DOUBLE}");
        sql.SET("over_wait_time_cost = #{record.overWaitTimeCost,jdbcType=DOUBLE}");
        sql.SET("other_fee1 = #{record.otherFee1,jdbcType=DOUBLE}");
        sql.SET("other_fee2 = #{record.otherFee2,jdbcType=DOUBLE}");
        sql.SET("applyFee = #{record.applyfee,jdbcType=DOUBLE}");
        sql.SET("cfm_over_time = #{record.cfmOverTime,jdbcType=INTEGER}");
        sql.SET("cfm_over_distance = #{record.cfmOverDistance,jdbcType=DOUBLE}");
        sql.SET("cfm_over_day = #{record.cfmOverDay,jdbcType=DOUBLE}");
        sql.SET("cfm_other_fee1 = #{record.cfmOtherFee1,jdbcType=DOUBLE}");
        sql.SET("cfm_other_fee2 = #{record.cfmOtherFee2,jdbcType=DOUBLE}");
        sql.SET("cfm_fee = #{record.cfmFee,jdbcType=DOUBLE}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        TradeAdditionalDetailExample example = (TradeAdditionalDetailExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(TradeAdditionalDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_additional_detail`");
        
        if (record.getAdditionalId() != null) {
            sql.SET("additional_id = #{additionalId,jdbcType=VARCHAR}");
        }
        
        if (record.getDailyDate() != null) {
            sql.SET("daily_date = #{dailyDate,jdbcType=DATE}");
        }
        
        if (record.getOverTime() != null) {
            sql.SET("over_time = #{overTime,jdbcType=INTEGER}");
        }
        
        if (record.getOverTimePrice() != null) {
            sql.SET("over_time_price = #{overTimePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitTimePrice() != null) {
            sql.SET("unit_time_price = #{unitTimePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDistance() != null) {
            sql.SET("over_distance = #{overDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDistancePrice() != null) {
            sql.SET("over_distance_price = #{overDistancePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitDistancePrice() != null) {
            sql.SET("unit_distance_price = #{unitDistancePrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDay() != null) {
            sql.SET("over_day = #{overDay,jdbcType=DOUBLE}");
        }
        
        if (record.getOverDayPrice() != null) {
            sql.SET("over_day_price = #{overDayPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getUnitDayPrice() != null) {
            sql.SET("unit_day_price = #{unitDayPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getOverWaitTimeCost() != null) {
            sql.SET("over_wait_time_cost = #{overWaitTimeCost,jdbcType=DOUBLE}");
        }
        
        if (record.getOtherFee1() != null) {
            sql.SET("other_fee1 = #{otherFee1,jdbcType=DOUBLE}");
        }
        
        if (record.getOtherFee2() != null) {
            sql.SET("other_fee2 = #{otherFee2,jdbcType=DOUBLE}");
        }
        
        if (record.getApplyfee() != null) {
            sql.SET("applyFee = #{applyfee,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOverTime() != null) {
            sql.SET("cfm_over_time = #{cfmOverTime,jdbcType=INTEGER}");
        }
        
        if (record.getCfmOverDistance() != null) {
            sql.SET("cfm_over_distance = #{cfmOverDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOverDay() != null) {
            sql.SET("cfm_over_day = #{cfmOverDay,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOtherFee1() != null) {
            sql.SET("cfm_other_fee1 = #{cfmOtherFee1,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmOtherFee2() != null) {
            sql.SET("cfm_other_fee2 = #{cfmOtherFee2,jdbcType=DOUBLE}");
        }
        
        if (record.getCfmFee() != null) {
            sql.SET("cfm_fee = #{cfmFee,jdbcType=DOUBLE}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("detail_id = #{detailId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_additional_detail`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, TradeAdditionalDetailExample example, boolean includeExamplePhrase) {
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