package com.sjsu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sjsu.BO.UploadAppBO;
import com.sjsu.dao.ILoginDao;
import com.sjsu.dao.IAppDao;

@Component
public class UploadAppServiceImpl implements IUploadAppService{

	private IAppDao appDao;
	
	public IAppDao getAppDao() {
		return appDao;
	}

	@Autowired
	public void setAppDao(IAppDao appDao) {
		this.appDao = appDao;
	}

	/*@Override
	public String editAppProfile(UploadAppBO appDetails) {
		String result = appDao.editAppProfile(appDetails);
		return result;
	}
	*/

	@Override
	public String saveAppDetails(UploadAppBO uploadAppBO) {
		String result = appDao.saveAppProfile(uploadAppBO);
		// TODO Auto-generated method stub
		return null;
	}

}
