package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArchiveBox: ImageVector
    get() {
        if (_ArchiveBox != null) {
            return _ArchiveBox!!
        }
        _ArchiveBox = ImageVector.Builder(
            name = "Filled.ArchiveBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.375f, 3f)
                curveTo(2.339f, 3f, 1.5f, 3.84f, 1.5f, 4.875f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineToRelative(-0.75f)
                curveTo(22.5f, 3.839f, 21.66f, 3f, 20.625f, 3f)
                horizontalLineTo(3.375f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveToRelative(3.087f, 9f)
                lineToRelative(0.54f, 9.176f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.62f, 21f)
                horizontalLineToRelative(10.757f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.995f, -2.824f)
                lineTo(20.913f, 9f)
                lineTo(3.087f, 9f)
                close()
                moveTo(9.25f, 12.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 12f)
                horizontalLineToRelative(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _ArchiveBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveBox: ImageVector? = null
