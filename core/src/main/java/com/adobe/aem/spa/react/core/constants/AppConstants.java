package com.adobe.aem.spa.react.core.constants;

/**
 * @author ayesan
 * 
 * This class has all the project related constants
 */
public final class AppConstants {
	
	public static final String URL = "https://jsonplaceholder.typicode.com/todos/";

    public static final String FORWARD_SLASH = "/";
    public static final String EQUALS = "=";
    public static final String NEW_LINE = "\n";

    // TO-DO related constants
    public static final String TODO_ENDPOINT = "https://jsonplaceholder.typicode.com/todos/";
    public static final long TODO_THREAD_SLEEP_TIME = 14400000;

    // Resource Resolver Factory sub-service
    public static final String SUB_SERVICE = "tutorialSubService";

    // Workflow Process Label
    public static final String PROCESS_LABEL = "process.label";
    // Workflow Chooser Label
    public static final String CHOOSER_LABEL = "chooser.label";
    // Child page count
    public static final String CHILD_PAGE_COUNT = "childPageCount";

    // User groups
    public static final String ADMINISTRATORS = "administrators";
    public static final String CONTENT_AUTHORS = "content-authors";

    // Dynamic datasource
    public static final String DATASOURCE = "datasource";
    public static final String DROPDOWN_SELECTOR = "dropdownSelector";
    public static final String COUNTRY_LIST = "countryList";
    public static final String COUNTRY_LIST_PATH = "/content/dam/spa-react/country.json";
    public static final String COLOR_LIST = "colorList";
    public static final String COLOR_LIST_PATH = "/content/dam/spa-react/color.json";
    public static final String FONT_LIST = "fontList";
    public static final String FONT_LIST_PATH = "/content/dam/spa-react/font.json";

}