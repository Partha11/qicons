package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Truck: ImageVector
    get() {
        if (_Truck != null) {
            return _Truck!!
        }
        _Truck = ImageVector.Builder(
            name = "Filled.Truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.375f, 4.5f)
                curveTo(2.339f, 4.5f, 1.5f, 5.34f, 1.5f, 6.375f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(12f)
                verticalLineTo(6.375f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                horizontalLineToRelative(-8.25f)
                close()
                moveTo(13.5f, 15f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2.625f)
                curveToRelative(0f, 1.035f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(0.375f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                verticalLineTo(15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
                close()
                moveTo(15.75f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 0.087f, 0.015f, 0.17f, 0.042f, 0.248f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.958f, 0.464f)
                curveToRelative(0.853f, -0.175f, 1.522f, -0.935f, 1.464f, -1.883f)
                arcToRelative(18.659f, 18.659f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.732f, -10.104f)
                arcToRelative(1.837f, 1.837f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, -0.725f)
                horizontalLineTo(15.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
                close()
            }
        }.build()

        return _Truck!!
    }

@Suppress("ObjectPropertyName")
private var _Truck: ImageVector? = null
