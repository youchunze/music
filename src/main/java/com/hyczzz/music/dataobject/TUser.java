package com.hyczzz.music.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_user")
public class TUser  implements Serializable {

	private static final long serialVersionUID = -3927866379893067597L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "login_name")
	private String loginName;

	private String password;

	@Column(name = "could_id")
	private String couldId;

	@Column(name = "qq_id")
	private String qqId;

	@Column(name = "kugou_id")
	private String kugouId;

	@Column(name = "real_name")
	private String realName;

	private String phone;

	private String email;

	private Integer sex;

	private String photo;

}
