package com.ifountain.client.opsgenie;

import com.ifountain.client.ClientException;
import com.ifountain.client.opsgenie.model.integration.EnableIntegrationRequest;
import com.ifountain.client.opsgenie.model.integration.EnableIntegrationResponse;

import java.io.IOException;
import java.text.ParseException;

/**
 * Interface for accessing OpsGenie for integration related operations
 *
 * @version 6/1/12 10:09 AM
 * @see OpsGenieClient
 */
public interface IIntegrationOpsGenieClient {
    /**
     * Enable or disable integration
     *
     * @param enableIntegrationRequest  Object to construct request parameters.
     * @see com.ifountain.client.opsgenie.model.integration.EnableIntegrationRequest
     * @see com.ifountain.client.opsgenie.model.integration.EnableIntegrationResponse
     */
    public EnableIntegrationResponse enableIntegration(EnableIntegrationRequest enableIntegrationRequest) throws ParseException, ClientException, IOException;
}