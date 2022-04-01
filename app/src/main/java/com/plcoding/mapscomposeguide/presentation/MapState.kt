package com.plcoding.mapscomposeguide.presentation

import com.google.maps.android.compose.MapProperties
import com.plcoding.mapscomposeguide.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)