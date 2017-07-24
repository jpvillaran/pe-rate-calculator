package com.patriotenergygroup.ratecalculator.payload;

import org.springframework.stereotype.Component;

@Component("payloadFactory")
public final class PayloadFactory {
	public <T> Payload<T> createFor(T data) {
		
		Payload<T> payload = new BasePayload<T>(data);
		return payload;
	}
	
	private class BasePayload<T> implements Payload<T> {

		T payload;
		
		public BasePayload(T payload) {
			this.payload = payload;
		}
		
		@Override
		public void setPayload(T payload) {
			this.payload = payload;
		}

		@Override
		public T getPayload() {
			return this.payload;
		}
	}
}
