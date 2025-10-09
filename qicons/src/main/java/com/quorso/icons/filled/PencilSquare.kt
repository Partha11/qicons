package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.PencilSquare: ImageVector
    get() {
        if (_PencilSquare != null) {
            return _PencilSquare!!
        }
        _PencilSquare = ImageVector.Builder(
            name = "Filled.PencilSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.731f, 2.269f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.712f, 0f)
                lineToRelative(-1.157f, 1.157f)
                lineToRelative(3.712f, 3.712f)
                lineToRelative(1.157f, -1.157f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.712f)
                close()
                moveTo(19.513f, 8.199f)
                lineToRelative(-3.712f, -3.712f)
                lineToRelative(-8.4f, 8.4f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 2.214f)
                lineToRelative(-0.8f, 2.685f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.933f, 0.933f)
                lineToRelative(2.685f, -0.8f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.214f, -1.32f)
                lineToRelative(8.4f, -8.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.25f, 5.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(13.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(5.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 1.5f)
                horizontalLineTo(5.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, -1.5f)
                verticalLineTo(8.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                horizontalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }.build()

        return _PencilSquare!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSquare: ImageVector? = null
