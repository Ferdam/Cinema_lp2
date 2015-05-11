function sideMenuSetValue(id, value) {
    document.getElementById(id).value=value;
    document.getElementById('maincontroller').submit();
    return false;
}