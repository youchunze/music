package com.hyczzz.music.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "t_song")
public class TSong  implements Serializable {

	private static final long serialVersionUID = -5297281788376102288L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "song_id")
	private Long songId;

	@Column(name = "song_name")
	private String songName;

	@Column(name = "sing_id")
	private Long singId;

	@Column(name = "could_id")
	private String couldId;

	@Column(name = "qq_id")
	private String qqId;

	@Column(name = "kugou_id")
	private String kugouId;

}
