package com.deloitte.main2;

import com.deloitte.flyer.SeaPlane;
import com.deloitte.other.RiverBarge;
import com.deloitte.other.Sailer;

public class Harbor {
public static void main(String[] args) {
	Harbor bostonHarbor = new Harbor();
	RiverBarge barge = new RiverBarge();
	SeaPlane sPlane = new SeaPlane();
	
	bostonHarbor.givePermissionToDock(barge);
	bostonHarbor.givePermissionToDock(sPlane);
}
private void givePermissionToDock(Sailer s) {
	s.dock();
}
}
