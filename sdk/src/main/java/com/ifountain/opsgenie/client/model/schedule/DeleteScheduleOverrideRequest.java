package com.ifountain.opsgenie.client.model.schedule;

import com.ifountain.opsgenie.client.model.BaseRequest;

/**
 * Container for the parameters to make an delete schedule override api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @see com.ifountain.opsgenie.client.IScheduleOpsGenieClient#deleteScheduleOverride(DeleteScheduleOverrideRequest)
 */
public class DeleteScheduleOverrideRequest extends BaseRequest<DeleteScheduleOverrideResponse, DeleteScheduleOverrideRequest> {
    private String alias;
    private String schedule;

    /**
     * Rest api uri of delete schedule override operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/schedule/override";
    }

    /**
     * A user defined identifier for the override.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets a user defined identifier for the override.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Id or the name of the schedule that the override belongs to.
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * Sets the id or the name of the schedule that the override belongs to.
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }


    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    @Override
    public DeleteScheduleOverrideResponse createResponse() {
        return new DeleteScheduleOverrideResponse();
    }

    public DeleteScheduleOverrideRequest withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public DeleteScheduleOverrideRequest withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
}
