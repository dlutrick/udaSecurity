module com.udacity.catpoint.security {
    exports com.udacity.catpoint.security.data;
    exports com.udacity.catpoint.security.service;
    exports com.udacity.catpoint.security.application;
    requires java.desktop;
    requires image;
    requires com.google.common;
    requires java.prefs;
    requires com.google.gson;
    opens com.udacity.catpoint.security.service;
}