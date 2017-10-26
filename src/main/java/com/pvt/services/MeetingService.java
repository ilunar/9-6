package com.pvt.services;

import com.pvt.DAO.MeetingDao;
import com.pvt.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MeetingService {
    @Autowired
    private MeetingDao meetingDao;
    
    @Transactional
    public void addMeeting(Meeting meet) {
	meetingDao.addMeeting(meet);
    }
    
    @Transactional
    public Meeting getMeeting(Integer id) {
	return meetingDao.getMeeting(id);
    }
    
    @Transactional
    public void deleteMeeting(Integer id) {
	meetingDao.deleteMeeting(id);
    }
}
