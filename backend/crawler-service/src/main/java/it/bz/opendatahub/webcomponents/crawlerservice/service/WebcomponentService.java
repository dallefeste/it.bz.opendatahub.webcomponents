package it.bz.opendatahub.webcomponents.crawlerservice.service;

public interface WebcomponentService {
    void updateWebcomponent(String uuid);

    void markDeletedWhereOriginIsDeleted();
}
