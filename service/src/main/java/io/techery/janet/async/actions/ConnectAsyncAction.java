package io.techery.janet.async.actions;

import io.techery.janet.async.annotations.AsyncAction;

@AsyncAction(value = "connect", incoming = true)
final public class ConnectAsyncAction implements ServerStatusAction {

    public boolean reconnectIfConnected;

    public ConnectAsyncAction() {
    }

    public ConnectAsyncAction(boolean reconnectIfConnected) {
        this.reconnectIfConnected = reconnectIfConnected;
    }
}
