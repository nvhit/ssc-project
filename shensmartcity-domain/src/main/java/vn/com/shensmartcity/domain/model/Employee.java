package vn.com.shensmartcity.domain.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private String staffCode;
	private String staffName;
	private String staffAccount;
	private String staffPass;

}
