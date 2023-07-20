@B29G12-243 @VyTrack
Feature: Verify that user can/can't view columns on the Vehicle models page

	
	 @VyTrack
	Scenario: The store manager  sees 10 columns on the Vehicle Model page.
		Given Store manager is logged in as Store manager and on home page
		When Store manager click on Fleet
		And Store manager click on Vehicles Model
		Then Store manager sees  modelName
		Then Store manager sees  make
		Then Store manager sees  canBeRequested
		Then Store manager sees  cVVI
		Then Store manager sees  cO2_FEE_MONTH
		Then Store manager sees  cost_DEPRECIATED
		Then Store manager sees  total_COST_DEPRECIATED
		Then Store manager sees  co2_EMISSIONS
		Then Store manager sees  fuel_TYPE
		Then Store manager sees  vendors



	
	 @VyTrack
	Scenario: The sales manager should see 10 columns on the Vehicle Model page.
		Given Sales manager is logged in as Store manager and on home page
		When Sales manager click on Fleet
		And Sales manager click on Vehicles Model
		Then Sales manager sees  modelName
		Then Sales manager sees  make
		Then Sales manager sees  canBeRequested
		Then Sales manager sees  cVVI
		Then Sales manager sees  cO2_FEE_MONTH
		Then Sales manager sees  cost_DEPRECIATED
		Then Sales manager sees  total_COST_DEPRECIATED
		Then Sales manager sees  co2_EMISSIONS
		Then Sales manager sees  fuel_TYPE
		Then Sales manager sees  vendors




	 @VyTrack
	Scenario: Drivers should not able to access the Vehicle Model page

			Given User is logged in as Driver and on home page
			When Driver click on Fleet
			And Driver click on Vehicles Model
			Then Driver sees a message You do not have permission to perform this action.