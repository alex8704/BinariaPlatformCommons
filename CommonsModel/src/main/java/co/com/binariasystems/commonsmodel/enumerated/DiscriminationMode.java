package co.com.binariasystems.commonsmodel.enumerated;

public enum DiscriminationMode {
	ZERO_HUNDRED(0,1),
	FIFTY_FIFTY(0.5f,0.5f),
	HUNDRED_ZERO(1f,0);
	private final float firstTimePercent;
	private final float lastTimePercent;
	
	private DiscriminationMode(float firstTimePercent, float lastTimePercent) {
		this.firstTimePercent = firstTimePercent;
		this.lastTimePercent = lastTimePercent;
	}

	public float getFirstTimePercent() {
		return firstTimePercent;
	}

	public float getLastTimePercent() {
		return lastTimePercent;
	}
	
	
}
