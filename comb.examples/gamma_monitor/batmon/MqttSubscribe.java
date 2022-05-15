package the.generated.package.name;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttSubscribe implements MqttCallback {
	private monitormanager monitormanager = new monitormanager();

	public static void main(String[] args) {
		String topic = "MQTT Examples";
		int qos = 2;
		String serverURL = "tcp://localhost:1883";
		String clientId = "MonitorManager";
		MemoryPersistence persistence = new MemoryPersistence();

		try {
			MqttAsyncClient sampleClient = new MqttAsyncClient(serverURL, clientId, persistence);
			MqttConnectOptions connOpts = new MqttConnectOptions();
			connOpts.setCleanSession(true);
			sampleClient.setCallback(new MqttSubscribe());
			System.out.println("Connecting to broker: " + serverURL);
			sampleClient.connect(connOpts);
			System.out.println("Connected");
			Thread.sleep(1000);
			sampleClient.subscribe(topic, qos);
			System.out.println("Subscribed");
		} catch (Exception me) {
			if (me instanceof MqttException) {
				System.out.println("reason " + ((MqttException) me).getReasonCode());
			}
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
		}
	}

	public void connectionLost(Throwable arg0) {
		System.err.println("\nconnection lost: " + arg0.getMessage());
	}

	public void deliveryComplete(IMqttDeliveryToken arg0) {
		System.err.println("delivery complete");
	}

	public void messageArrived(String topic, MqttMessage message) {
		System.out.println("(topic: " + topic + ", message: " + new String(message.getPayload()) + ")");

		monitormanager.update(new String(message.getPayload()));
	}
}