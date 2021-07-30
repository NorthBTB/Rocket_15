package entity;

public class HinhHocException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HinhHocException() {
		super("So luong hinh toi da la : + " + Configs.SO_LUONG_HINH_TOI_DA);

	}
}
