// SPDX-FileCopyrightText: NOI Techpark <digital@noi.bz.it>
//
// SPDX-License-Identifier: AGPL-3.0-or-later

package it.bz.opendatahub.webcomponents.common.hibernate.usertype;

import java.util.List;

public abstract class ListUserType extends AbstractUserType {
	@Override
    public Class returnedClass() {
        return List.class;
    }
}
