/*
 * Copyright © 2017 Wasenoku
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package me.wasenoku.craigal.geo;





/**
 * Simple enum that contains a list of ISO regions that
 * this application is able to scrape locations from.
 *
 * @author Wasenoku
 * @version 1.0
 * @since 1.0
 */
public enum GeoList
{
    US, EU, AU;





    /**
     * Base URL used for building subsequent ISO region URLs.
     */
    private static final String BASE_URL = "https://geo.craigslist.org/iso/";





    /**
     * ISO region url built from the type name itself
     */
    private final String url = GeoList.BASE_URL + this.name().toLowerCase();





    /**
     * Return the ISO region's URL.
     *
     * @return the ISO region URL
     */
    public String getUrl()
    {
        return this.url;
    }
}