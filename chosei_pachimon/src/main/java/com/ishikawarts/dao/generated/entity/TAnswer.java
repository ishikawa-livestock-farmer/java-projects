package com.ishikawarts.dao.generated.entity;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TAnswer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_ANSWER.EVENT_ID
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_ANSWER.USER_NAME
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_ANSWER.PROPOSED_DATETIME
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String proposedDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_ANSWER.ANSWER
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_ANSWER.UPDATE_USER
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_ANSWER.UPDATE_TSTAMP
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private LocalDateTime updateTstamp;
}