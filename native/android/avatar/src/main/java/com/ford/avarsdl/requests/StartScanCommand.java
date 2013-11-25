package com.ford.avarsdl.requests;

import com.ford.avarsdl.business.MainApp;
import com.ford.avarsdl.service.SDLService;
import com.ford.avarsdl.util.Logger;
import com.ford.syncV4.exception.SyncException;
import com.ford.syncV4.proxy.SyncProxyALM;
import com.ford.syncV4.proxy.rpc.StartScan;

import org.json.JSONObject;

/**
 * Created with Android Studio.
 * Author: Chernyshov Yuriy - Mobile Development
 * Date: 11/19/13
 * Time: 3:39 PM
 */
public class StartScanCommand implements RequestCommand {

    @Override
    public void execute(int id, JSONObject jsonParameters) {
        SyncProxyALM proxy = SDLService.getProxyInstance();
        if (proxy != null) {
            StartScan msg = new StartScan();
            msg.setCorrelationID(id);

            try {
                proxy.sendRPCRequest(msg);
            } catch (SyncException e) {
                Logger.e(getClass().getSimpleName() + " can't send message", e);
            }
        } else {
            Logger.e(getClass().getSimpleName() + " proxy is NULL");
        }
    }
}