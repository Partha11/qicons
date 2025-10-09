package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) {
            return _MagnifyingGlassMinus!!
        }
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "Filled.MagnifyingGlassMinus",
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
                moveTo(6.75f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
            }
        }.build()

        return _MagnifyingGlassMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassMinus: ImageVector? = null
