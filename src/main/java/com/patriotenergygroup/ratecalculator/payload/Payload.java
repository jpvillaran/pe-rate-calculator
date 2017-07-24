package com.patriotenergygroup.ratecalculator.payload;

public interface Payload<T> {
	void setPayload(T payload);
	T getPayload();
}
