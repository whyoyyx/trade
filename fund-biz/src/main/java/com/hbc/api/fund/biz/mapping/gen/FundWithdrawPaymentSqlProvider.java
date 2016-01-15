package com.hbc.api.fund.biz.mapping.gen;

import com.hbc.api.fund.biz.mapping.gen.bean.FundWithdrawPayment;
import com.hbc.api.fund.biz.mapping.gen.bean.FundWithdrawPaymentExample.Criteria;
import com.hbc.api.fund.biz.mapping.gen.bean.FundWithdrawPaymentExample.Criterion;
import com.hbc.api.fund.biz.mapping.gen.bean.FundWithdrawPaymentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FundWithdrawPaymentSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String countByExample(FundWithdrawPaymentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`fund_withdraw_payment`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String deleteByExample(FundWithdrawPaymentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`fund_withdraw_payment`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String insertSelective(FundWithdrawPayment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`fund_withdraw_payment`");
        
        if (record.getPaymentId() != null) {
            sql.VALUES("payment_id", "#{paymentId,jdbcType=VARCHAR}");
        }
        
        if (record.getDrawNo() != null) {
            sql.VALUES("draw_no", "#{drawNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNo() != null) {
            sql.VALUES("batch_no", "#{batchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.VALUES("payment_method", "#{paymentMethod,jdbcType=TINYINT}");
        }
        
        if (record.getGuideId() != null) {
            sql.VALUES("guide_id", "#{guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayeeAccount() != null) {
            sql.VALUES("payee_account", "#{payeeAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getPayeeName() != null) {
            sql.VALUES("payee_name", "#{payeeName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransferAmount() != null) {
            sql.VALUES("transfer_amount", "#{transferAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getActualAmount() != null) {
            sql.VALUES("actual_amount", "#{actualAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getTransferDatetime() != null) {
            sql.VALUES("transfer_datetime", "#{transferDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayerAccount() != null) {
            sql.VALUES("payer_account", "#{payerAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorName() != null) {
            sql.VALUES("operator_name", "#{operatorName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransferStatus() != null) {
            sql.VALUES("transfer_status", "#{transferStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String selectByExample(FundWithdrawPaymentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("payment_id");
        } else {
            sql.SELECT("payment_id");
        }
        sql.SELECT("draw_no");
        sql.SELECT("batch_no");
        sql.SELECT("payment_method");
        sql.SELECT("guide_id");
        sql.SELECT("payee_account");
        sql.SELECT("payee_name");
        sql.SELECT("transfer_amount");
        sql.SELECT("actual_amount");
        sql.SELECT("transfer_datetime");
        sql.SELECT("payer_account");
        sql.SELECT("operator_id");
        sql.SELECT("operator_name");
        sql.SELECT("transfer_status");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.SELECT("remark");
        sql.FROM("`fund_withdraw_payment`");
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
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FundWithdrawPayment record = (FundWithdrawPayment) parameter.get("record");
        FundWithdrawPaymentExample example = (FundWithdrawPaymentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`fund_withdraw_payment`");
        
        if (record.getPaymentId() != null) {
            sql.SET("payment_id = #{record.paymentId,jdbcType=VARCHAR}");
        }
        
        if (record.getDrawNo() != null) {
            sql.SET("draw_no = #{record.drawNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNo() != null) {
            sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.SET("payment_method = #{record.paymentMethod,jdbcType=TINYINT}");
        }
        
        if (record.getGuideId() != null) {
            sql.SET("guide_id = #{record.guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayeeAccount() != null) {
            sql.SET("payee_account = #{record.payeeAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getPayeeName() != null) {
            sql.SET("payee_name = #{record.payeeName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransferAmount() != null) {
            sql.SET("transfer_amount = #{record.transferAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getActualAmount() != null) {
            sql.SET("actual_amount = #{record.actualAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getTransferDatetime() != null) {
            sql.SET("transfer_datetime = #{record.transferDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayerAccount() != null) {
            sql.SET("payer_account = #{record.payerAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{record.operatorId,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorName() != null) {
            sql.SET("operator_name = #{record.operatorName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransferStatus() != null) {
            sql.SET("transfer_status = #{record.transferStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`fund_withdraw_payment`");
        
        sql.SET("payment_id = #{record.paymentId,jdbcType=VARCHAR}");
        sql.SET("draw_no = #{record.drawNo,jdbcType=VARCHAR}");
        sql.SET("batch_no = #{record.batchNo,jdbcType=VARCHAR}");
        sql.SET("payment_method = #{record.paymentMethod,jdbcType=TINYINT}");
        sql.SET("guide_id = #{record.guideId,jdbcType=VARCHAR}");
        sql.SET("payee_account = #{record.payeeAccount,jdbcType=VARCHAR}");
        sql.SET("payee_name = #{record.payeeName,jdbcType=VARCHAR}");
        sql.SET("transfer_amount = #{record.transferAmount,jdbcType=DOUBLE}");
        sql.SET("actual_amount = #{record.actualAmount,jdbcType=DOUBLE}");
        sql.SET("transfer_datetime = #{record.transferDatetime,jdbcType=TIMESTAMP}");
        sql.SET("payer_account = #{record.payerAccount,jdbcType=VARCHAR}");
        sql.SET("operator_id = #{record.operatorId,jdbcType=VARCHAR}");
        sql.SET("operator_name = #{record.operatorName,jdbcType=VARCHAR}");
        sql.SET("transfer_status = #{record.transferStatus,jdbcType=INTEGER}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("remark = #{record.remark,jdbcType=VARCHAR}");
        
        FundWithdrawPaymentExample example = (FundWithdrawPaymentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(FundWithdrawPayment record) {
        SQL sql = new SQL();
        sql.UPDATE("`fund_withdraw_payment`");
        
        if (record.getDrawNo() != null) {
            sql.SET("draw_no = #{drawNo,jdbcType=VARCHAR}");
        }
        
        if (record.getBatchNo() != null) {
            sql.SET("batch_no = #{batchNo,jdbcType=VARCHAR}");
        }
        
        if (record.getPaymentMethod() != null) {
            sql.SET("payment_method = #{paymentMethod,jdbcType=TINYINT}");
        }
        
        if (record.getGuideId() != null) {
            sql.SET("guide_id = #{guideId,jdbcType=VARCHAR}");
        }
        
        if (record.getPayeeAccount() != null) {
            sql.SET("payee_account = #{payeeAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getPayeeName() != null) {
            sql.SET("payee_name = #{payeeName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransferAmount() != null) {
            sql.SET("transfer_amount = #{transferAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getActualAmount() != null) {
            sql.SET("actual_amount = #{actualAmount,jdbcType=DOUBLE}");
        }
        
        if (record.getTransferDatetime() != null) {
            sql.SET("transfer_datetime = #{transferDatetime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPayerAccount() != null) {
            sql.SET("payer_account = #{payerAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=VARCHAR}");
        }
        
        if (record.getOperatorName() != null) {
            sql.SET("operator_name = #{operatorName,jdbcType=VARCHAR}");
        }
        
        if (record.getTransferStatus() != null) {
            sql.SET("transfer_status = #{transferStatus,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("payment_id = #{paymentId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `fund_withdraw_payment`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, FundWithdrawPaymentExample example, boolean includeExamplePhrase) {
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