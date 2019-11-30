package com.github.funthomas424242.rezeptsammlung.rezept;

/*-
 * #%L
 * rezeptsammlung
 * %%
 * Copyright (C) 2019 PIUG
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.github.funthomas424242.rades.annotations.builder.RadesAddBuilder;
import org.dizitart.no2.NitriteId;
import org.dizitart.no2.objects.Id;

import java.io.Serializable;
import java.util.Objects;

@RadesAddBuilder
public class Rezept implements Serializable {

    @Id
    protected NitriteId id;

    protected String titel;

    protected String tag;


    public NitriteId getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rezept)) return false;
        Rezept rezept = (Rezept) o;
        return id.equals(rezept.id) &&
            Objects.equals(titel, rezept.titel) &&
            Objects.equals(tag, rezept.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, tag);
    }
}
