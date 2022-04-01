package com.plcoding.mapscomposeguide.data

import com.plcoding.mapscomposeguide.domain.model.ParkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot {
    return ParkingSpot(
        lat, lng, id
    )
}

fun ParkingSpot.toParkingSpotEntity(): ParkingSpotEntity{
    return ParkingSpotEntity(
        lat, lng, id
    )
}