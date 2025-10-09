package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.BuildingLibrary: ImageVector
    get() {
        if (_BuildingLibrary != null) {
            return _BuildingLibrary!!
        }
        _BuildingLibrary = ImageVector.Builder(
            name = "Filled.BuildingLibrary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.584f, 2.376f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.832f, 0f)
                lineToRelative(9f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.832f, 1.248f)
                lineTo(12f, 3.901f)
                lineTo(3.416f, 9.624f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.832f, -1.248f)
                lineToRelative(9f, -6f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.25f, 10.332f)
                verticalLineToRelative(9.918f)
                lineTo(21f, 20.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(3f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-9.918f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.634f, -0.74f)
                arcTo(49.109f, 49.109f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                curveToRelative(2.59f, 0f, 5.134f, 0.202f, 7.616f, 0.592f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.634f, 0.74f)
                close()
                moveTo(12.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-6.75f)
                close()
                moveTo(15.75f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(9f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-6.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.875f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2.25f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.25f)
                close()
            }
        }.build()

        return _BuildingLibrary!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingLibrary: ImageVector? = null
