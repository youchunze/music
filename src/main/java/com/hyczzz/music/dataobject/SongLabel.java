package com.hyczzz.music.dataobject;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "song_label")
public class SongLabel  implements Serializable {

	private static final long serialVersionUID = 8819461947351121080L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "t_id")
	private Long tId;

	@Column(name = "sing_id")
	private Long singId;

	@Column(name = "label_id")
	private Long labelId;

}
