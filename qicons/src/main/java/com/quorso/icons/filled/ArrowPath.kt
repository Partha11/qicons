package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.ArrowPath: ImageVector
    get() {
        if (_ArrowPath != null) {
            return _ArrowPath!!
        }
        _ArrowPath = ImageVector.Builder(
            name = "Filled.ArrowPath",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.755f, 10.059f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.548f, -3.364f)
                lineToRelative(1.903f, 1.903f)
                horizontalLineToRelative(-3.183f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(4.992f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                lineTo(21.765f, 4.356f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(3.18f)
                lineToRelative(-1.9f, -1.9f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.306f, 9.67f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.45f, 0.388f)
                close()
                moveTo(20.163f, 13.411f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.919f, 0.53f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.548f, 3.364f)
                lineToRelative(-1.902f, -1.903f)
                horizontalLineToRelative(3.183f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(2.984f, 13.902f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(4.992f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-3.18f)
                lineToRelative(1.9f, 1.9f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.059f, -4.035f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -0.918f)
                close()
            }
        }.build()

        return _ArrowPath!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowPath: ImageVector? = null
