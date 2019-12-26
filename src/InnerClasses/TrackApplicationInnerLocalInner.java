package InnerClasses;

interface Tracking {
	String getShipmentStatus();
}

public class TrackApplicationInnerLocalInner  {
	
	private String ApplicationName;
	private boolean mailed = false;
	
	public Tracking getShipmentStatus(boolean mailed){
		if (mailed){
		class TrackApplication implements Tracking{
			private String applicantName;
			private String ApplicationId;
			private String receiverAddress;			
			
			public TrackApplication(){
				applicantName = "Sanjana";
				ApplicationId = "SS123456";
				receiverAddress = "UTD Richardson, TX";
				
			}

			@Override
			public String getShipmentStatus() {
				return "Application delivered";			 
			}
			public String toString(){
				return applicantName + "<>" + ApplicationId + "<>" + receiverAddress;  
			}
		}
		return new TrackApplication();
		}
		else 
			return null;
				
	}
	
	public static void main(String args[]){
		TrackApplicationInnerLocalInner trackAppl = new TrackApplicationInnerLocalInner();
		Tracking trackStatusHandle = trackAppl.getShipmentStatus(false);
		if (trackStatusHandle != null)
		{
			System.out.println(trackStatusHandle.getShipmentStatus());
			System.out.println(trackStatusHandle.toString());
		}
	}

}
