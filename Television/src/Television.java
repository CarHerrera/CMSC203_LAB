/**
 * The purpose of this class is to model a television
 * Carlos Herrera 10/09/2020
 *
 */
public class Television {
	//Brand name of the TV
	private final String MANUFACTURER;
	//Size of the TV
	private final int SCREEN_SIZE;
	//Value determines where the power is on or not
	private boolean powerOn;
	//Channel value
	private int channel;
	//Volume of the tv
	private int volume;
	/**
	 * This constructor Initializes the television object with a brand name, screen size, and
	 * sets the values powerOn to false, volume to 20, and channel to 2 by default.
	 * @param brand is the brand name of the Television, cannot be changed
	 * @param s is the size of the TV, cannot be changed
	 */
	public Television(String brand, int s) {
		MANUFACTURER = brand;
		SCREEN_SIZE = s;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	/**
	 * Sets the volume of the television
	 * @param v, the volume of the television
	 */
	public void setVolume(int v) {
		volume = v < 0 ? 0: volume;
	}
	/**
	 * Sets the channel for the tv
	 * @param chan
	 */
	public void setChannel(int chan) {
		channel = chan;
	}
	/**
	 * Sets the power of the TV
	 * @param p
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/**
	 * Increases the volume by one each time it's called
	 */
	public void increaseVolume() {
		volume++;
	}
	/**
	 * Decrease the volume each time it's called
	 */
	public void decreaseVolume() {
		--volume;
	}
	/**
	 * Returns the value of channel
	 * @return channel
	 */
	public int getChannel() {
		return channel;
	}
	/**
	 * Gets value of volume
	 * @return volume;
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * Returns the name of the Manufacturer/brand
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	/**
	 * Returns the size of the screen
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
}
