Feature: Reset reminder
 
  Scenario: On reseting the reminder on future program
  	Given that stb is up and running
  	When User tunes to any channel in Live TV
  	When User press TV_Guide hotkey
  	When User select a future program
  	When User set reminder from action menu
  	When User launch action menu again
  	When User select Reset reminder option
  	Then the reminder should be reset