package com.seleniumexpress.hibernate.C_SH_01_hibernate_first_project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="song")
public class song { // table name

	// songId, songName, singer - database variable names

	@Id
	@Column(name = "songId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int songId;
	
	@Column(name = "songName")
	private String songName;
	
	@Column(name = "singer")
	private String singer;
	
	
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "song [songId=" + songId + ", songName=" + songName + ", singer=" + singer + "]";
	}
	
}
