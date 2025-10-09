package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.MagnifyingGlassPlus: ImageVector
    get() {
        if (_MagnifyingGlassPlus != null) {
            return _MagnifyingGlassPlus!!
        }
        _MagnifyingGlassPlus = ImageVector.Builder(
            name = "Filled.MagnifyingGlassPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 3.75f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 13.5f)
                arcToRelative(6.75f, 6.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.5f)
                close()
                moveTo(2.25f, 10.5f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.59f, 5.28f)
                lineToRelative(4.69f, 4.69f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, 1.06f)
                lineToRelative(-4.69f, -4.69f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 10.5f)
                close()
                moveTo(10.5f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-2.25f)
                lineTo(7.5f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(2.25f)
                lineTo(9.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
            }
        }.build()

        return _MagnifyingGlassPlus!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassPlus: ImageVector? = null
