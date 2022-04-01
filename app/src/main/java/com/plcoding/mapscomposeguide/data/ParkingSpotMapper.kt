package com.plcoding.mapscomposeguide.data

import com.plcoding.mapscomposeguide.domain.ParkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot{
    return ParkingSpot(
        lat, lng, id
    )
}