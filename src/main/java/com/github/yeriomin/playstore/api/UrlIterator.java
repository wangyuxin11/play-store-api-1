package com.github.yeriomin.playstore.api;

public class UrlIterator extends AppListIterator {

    public UrlIterator(GooglePlayAPI googlePlayApi) {
        super(googlePlayApi);
    }

    public UrlIterator(GooglePlayAPI googlePlayApi, String firstPageUrl) {
        this(googlePlayApi);
        if (!firstPageUrl.startsWith(GooglePlayAPI.FDFE_URL)) {
            firstPageUrl = GooglePlayAPI.FDFE_URL + firstPageUrl;
        }
        this.firstPageUrl = firstPageUrl;
    }
}
