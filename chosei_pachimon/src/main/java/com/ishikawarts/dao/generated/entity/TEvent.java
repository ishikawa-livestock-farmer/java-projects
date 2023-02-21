package com.ishikawarts.dao.generated.entity;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TEvent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_EVENT.EVENT_ID
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_EVENT.TITLE
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_EVENT.DESCRIPTION
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_EVENT.UPDATE_USER
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.T_EVENT.UPDATE_TSTAMP
     *
     * @mbg.generated Tue Feb 21 23:49:25 JST 2023
     */
    private LocalDateTime updateTstamp;
}