ControlFocus("Open","","Edit1")
$apppath = @WorkingDir & "\src\main\java\test\java\External_files"
ControlSetText("Open","","Edit1", $apppath & "\girl.JPG")
Sleep(3000)
ControlClick("Open","","Button1")