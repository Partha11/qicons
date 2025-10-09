package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CloudArrowUp: ImageVector
    get() {
        if (_CloudArrowUp != null) {
            return _CloudArrowUp!!
        }
        _CloudArrowUp = ImageVector.Builder(
            name = "Filled.CloudArrowUp",
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
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.98f, 6.496f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 20.25f)
                lineTo(18f, 20.25f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.206f, -8.423f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.133f, -4.303f)
                arcTo(6.001f, 6.001f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 3.75f)
                close()
                moveTo(12.53f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(1.72f, -1.72f)
                verticalLineToRelative(4.94f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-4.94f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-3f, -3f)
                close()
            }
        }.build()

        return _CloudArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArrowUp: ImageVector? = null
